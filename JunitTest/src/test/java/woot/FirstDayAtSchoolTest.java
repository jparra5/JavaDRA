import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	String[] bag3 = { "Books", "Notebooks", "Pens", "Chalk" };
	String[] bag4 = { "Books", "Notebooks", "Pens", "Paper" };
	String[] bag5 = { "Books", "Notebooks", "Pens", "Rulers" };
	String[] bag6 = { "Books", "Notebooks", "Pens", "OOPS" };

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}

	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

	@Test
	public void testAddChalk() {
		System.out.println("Inside testAddChalk()");
		assertArrayEquals(bag3, school.addChalk());
	}

	@Test
	public void testAddPaper() {
		System.out.println("Inside testAddPaper()");
		assertArrayEquals(bag4, school.addPaper());
	}

	@Test
	public void testAddRulers() {
		System.out.println("Inside testAddRulers()");
		assertArrayEquals(bag5, school.addRulers());
	}

	@Test
	public void testAddBinders() {
		System.out.println("Inside testAddBinders()");
		assertArrayEquals(bag6, school.addBinders());
	}

}
