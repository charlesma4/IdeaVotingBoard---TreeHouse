package com.teamtreehouse.courses.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charl on 6/8/2017.
 */
public class SimpleCourseIdeaDAO implements CourseIdeaDAO{
    private List<CourseIdea> ideas;

    public SimpleCourseIdeaDAO() {
        ideas = new ArrayList<>();
    }

    @Override
    public boolean add(CourseIdea idea) {
        return ideas.add(idea);
    }

    @Override
    public List<CourseIdea> findAll() {
        return new ArrayList<>(ideas);
    }
}
