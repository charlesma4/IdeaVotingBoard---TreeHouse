package com.teamtreehouse.courses.model;

import java.util.List;

/**
 * Created by charl on 6/8/2017.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
