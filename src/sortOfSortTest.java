import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class sortOfSortTest extends sortOfSort{
	/*
	* sortOfSort
    * Test case 1:
    * firstTry.sortOfSort(a, a.length);
    * My main problem: 1st my arr isn't getting assigned it's new modification.
	 */
	@Test
	public void testSortOfSort(){
		int[] arr = {2, 67, 8, 96, 0, 17, -3, 0};
		int[] expect={17, 8, 0, -3,		0,2, 67,96};

		sortOfSort firstTry= new sortOfSort(arr);
		firstTry.sortOfSort();
		firstTry.twoDprinter(firstTry.arr);
		assertArrayEquals(expect, firstTry.arr);
	}

}