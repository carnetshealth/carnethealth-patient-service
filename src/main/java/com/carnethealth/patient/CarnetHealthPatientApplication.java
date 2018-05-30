package com.carnethealth.patient;

import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.carnethealth.patient.carnetid.CnHoldersType;
import com.carnethealth.patient.model.Patient;
import com.carnethealth.patient.repository.CnHoldersTypeRepository;
import com.carnethealth.patient.repository.PatientRepository;

@SpringBootApplication
public class CarnetHealthPatientApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	CnHoldersTypeRepository cnHoldersTypeRepository ;
	
	
	Patient patient = new Patient();

	public static void main(String[] args) {
		SpringApplication.run(CarnetHealthPatientApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean h2WebConsole() {
	    return new ServletRegistrationBean(new WebServlet(), "/h2-console/*");
	}
	
	@Configuration 
    public class WebConfig implements WebMvcConfigurer { 

    	@Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName(
                    "forward:/graphiql/index.html");
        }
    }
	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting -> {}", patientRepository.save(
				new Patient("PT00100CM", "PIERRE","FOKAM","PIERRE@GMAIL.COM","207 780 2347","CM1009283","CM2390183","ACTIF")));
		logger.info("Inserting -> {}", cnHoldersTypeRepository.save(
				new CnHoldersType("PTE","PATIENT")));
		logger.info("Inserting -> {}", cnHoldersTypeRepository.save(
				new CnHoldersType("PRO","PROVIDER")));
		logger.info("Inserting -> {}", cnHoldersTypeRepository.save(
				new CnHoldersType("INS","INSTITUTIONS")));
		
	} 
}
