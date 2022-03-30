package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Slayra
 * @date 2022-03-28
 **/

@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice")
@Configuration
public class Config {

}
