package com.sydney.library;

import com.sydney.library.Model.Card;
import com.sydney.library.Model.Student;
import com.sydney.library.Repository.CardRepository;
import com.sydney.library.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	CardRepository cardRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("Sydney",23,"India");
		Student s2 = new Student("Sooraj",24,"Oman");

		Card c1 = new Card(100);
//		c1.setStudent(s1);
		Card c2 = new Card(1000);
//		c2.setStudent(s2);
		s1.setCard(c2);
		s2.setCard(c1);


		studentRepository.save(s1);
		studentRepository.save(s2);
	}
}
