import org.junit.*;

public class TestDeleteRows {
	AClass a;
	int[][] anArray = {{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}};
	int firstRow = 2;
	int lastRow = 4;
	int [][] anArrayAfterDelete_ans = {{1,1},{2,2},{6,6}};

	// perform 6 test cases according to the specification from the Lab 7 question paper,
	// to be completed by you!

	@Before
	public void setUP() {
		a = new AClass();
		firstRow = 2;
		lastRow = 4;
		anArray = new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}};
		anArrayAfterDelete_ans = new int[][]{{1,1},{2,2},{6,6}};
	}
	
	@Test
	public void testDelete1() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		Assert.assertNull(result);
	}
	
	@Test
	public void testDelete2() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		Assert.assertNotNull(result);
	}
	
	@Test
	public void testDelete3() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		Assert.assertArrayEquals(result, anArrayAfterDelete_ans);
	}
	
	@Test
	public void testDelete4() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		Assert.assertTrue(result == anArrayAfterDelete_ans);
	}
	
	@Test
	public void testDelete5() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		Assert.assertFalse(result == anArrayAfterDelete_ans);
	}
	
	@Test
	public void testDelete6() {
		int[][] result = a.deleteRows( anArray,firstRow,lastRow );
		
		for(int i = 0; i < result.length; i++) {
			for(int r = 0; r < result[i].length; r++)
			Assert.assertEquals(result[i][r], anArrayAfterDelete_ans[i][r]);
		}
		
	}
}
