package com.registration.configuration;

import com.registration.batch.volunteer.VolunteerFieldSetMapper;
import com.registration.domain.jpa.Volunteer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;

/**
 * Created by Zeeshan Damani
 */

@Configuration
public class BatchConfiguration {

    @Autowired
    public DataSource dataSource;

    @Autowired
    private ResourceLoader resourceLoader;

    @Bean(name = "volunteerItemReader")
    @StepScope
    public FlatFileItemReader<Volunteer> volunteerItemCsvReader(@Value("#{jobParameters['sourceFilePath']}") String path) throws Exception {

        FlatFileItemReader<Volunteer> reader = new FlatFileItemReader<Volunteer>();
       // reader.setResource(resourceLoader.getResource(path));
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        // Creating an item reader which will read csv file
        Resource resource = resourceLoader.getResource(path);
        DefaultLineMapper<Volunteer> defaultLineMapper = new DefaultLineMapper<>();
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
//        defaultLineMapper.setFieldSetMapper(new BeanWrapperFieldSetMapper<Volunteer>(){{
//            setTargetType(Volunteer.class);
//        }});
        defaultLineMapper.setFieldSetMapper(new VolunteerFieldSetMapper());
        reader.setLineMapper(defaultLineMapper);
        reader.setLinesToSkip(1);
        reader.setResource(resource);
        reader.setSkippedLinesCallback(headerLine -> {
            delimitedLineTokenizer.setNames(headerLine.split(","));
        });

        return reader;
    }
}
