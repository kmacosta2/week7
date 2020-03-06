import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class sortOfSortTest extends sortOfSort{
	/*
	* sortOfSort
    * Test case 1:
    * firstTry.sortOfSort();
    * A test for an array with negative and positive integers. It worked
	 */
	@Test
	public void testSortOfSort1(){
		int[] arr = {96, 67, 17, 8, 2, 1 ,0 , 0, -3};
		int[] expect={17, 8, 0, 0,   -3 ,1,2, 67,96};

		sortOfSort firstTry= new sortOfSort(arr);
		firstTry.sortOfSort();
		firstTry.twoDprinter(firstTry.arr);
		assertArrayEquals(expect, firstTry.arr);
	}
	/*
	 * sortOfSort
	 * Test case 2:
	 * firstTry.sortOfSort();
	 * smallest size
	 */
	@Test
	public void testSortOfSort2(){
		int[] arr = {96};
		int[] expect={96};

		sortOfSort firstTry= new sortOfSort(arr);
		firstTry.sortOfSort();
		firstTry.twoDprinter(firstTry.arr);
		assertArrayEquals(expect, firstTry.arr);
	}

	/*
	* sortOfSort
    * Test case 3:
    * firstTry.sortOfSort();
    * odd length.
	 */
	@Test
	public void testSortOfSort3(){
		int[] arr = {96, 17, 67};
		int[] expect={17, 67, 96};

		sortOfSort firstTry= new sortOfSort(arr);
		firstTry.sortOfSort();
		firstTry.twoDprinter(firstTry.arr);
		assertArrayEquals(expect, firstTry.arr);
	}
	/*
	 * sortOfSort
	 * Test case 4:
	 * firstTry.sortOfSort();
	 * even length.
	 */
	@Test
	public void testSortOfSort4(){
		int[] arr = {2, 3, 17, 96};
		int[] expect={3, 2, 17, 96};

		sortOfSort firstTry= new sortOfSort(arr);
		firstTry.sortOfSort();
		firstTry.twoDprinter(firstTry.arr);
		assertArrayEquals(expect, firstTry.arr);
	}

}