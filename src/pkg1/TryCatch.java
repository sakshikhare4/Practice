package pkg1;

public class TryCatch {
	@SuppressWarnings("finally")
	static int returnValue() {
		try {
			String str=null;
			return 0;

		} catch (Exception e) {
			return 1;
		} 
		finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnValue());
	}

}
