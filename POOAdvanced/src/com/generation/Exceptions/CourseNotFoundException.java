package com.generation.Exceptions;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException()
    {
        super("course not found!!");
    }
}