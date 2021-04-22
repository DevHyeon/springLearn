package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = true)
//	@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	//@Autowired
	public InlineExamConsole(Exam exam) {
		System.out.println("overload constructor");
		this.exam = exam;
	}


	@Override
	public void print() {
		
		if(exam == null)
			System.out.printf("total is %d, avg is %f",0,0.0);
		else
			System.out.printf("total is %d, avg is %f",exam.total(),exam.avg());

	}

//	@Autowired
//	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
		
	}

}
