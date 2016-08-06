package assignment4;

public class cAssignmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mPrintReverseArray();
		
	}

	private static void mPrintReverseArray() 
	{
		String[] lArray = {"String5", "String8", "String2" , "String1" ,"String66", "String10"};
		for(int i = lArray.length; i > 0 ; i--)
		{
			System.out.println(lArray[i - 1]);
		
		}
	}

}
