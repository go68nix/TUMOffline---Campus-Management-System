package de.tum.in.ase.pse.controller;

import de.tum.in.ase.pse.model.Course;
import de.tum.in.ase.pse.view.CourseDetailView;
import de.tum.in.ase.pse.view.CourseListView;

public class Controller {

	private CourseListView courseListView;
	// HINT: Instantiate courseDetailView in selectCourse, don't make this a local variable
	private CourseDetailView courseDetailView;

    public void saveCourse(Course course) {
		courseListView.addCourse(course);
		course.notifyObservers();
	}
	public void selectCourse(Course course) {
		courseDetailView = new CourseDetailView(this, course);
		courseDetailView.show();
	}
	// TODO: Implement saveCourse(). This method should add the course to the list view and notify the observers

	// TODO: Implement selectCourse(). This method should initialize courseDetailView and display it

	public void setCourseListView(CourseListView courseListView) {
		this.courseListView = courseListView;
	}
}
