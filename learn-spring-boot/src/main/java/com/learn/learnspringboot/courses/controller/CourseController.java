package com.learn.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	
	  // http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		
		return List.of(new Course(1,"Learn Microservice","in30mins"), new Course(2,"Learn Cloud","in 6 days"));
	}
	
	// http://localhost:8080/courses/2
	
	@GetMapping("/courses/3")
	public Course getCourseDetails() {
		return new Course(3,"Learn Angular JS","in60mins");
		
	}
	
	@GetMapping("/courses/4")
	public Course getCourseDetail() {
		return new Course(4,"Learn React JS","in45mins");
		
	}


}
