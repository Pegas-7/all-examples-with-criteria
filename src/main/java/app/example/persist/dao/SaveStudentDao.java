package app.example.persist.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;


import app.SpringContext;
import app.example.persist.entity.Student;

public class SaveStudentDao
{
	EntityManager session = SpringContext.getInstance().getEntityManager();

	public SaveStudentDao()
	{
	}

	public Student saveStudent(Student student)
	{
		session.persist(student);
		return student;
	}
}
