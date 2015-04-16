	//改行するためだけのメソッドです。 
	private static void newLine (int count){
		
		for(int i = 0; i < count; i++){
			//どのプラットフォームでも改行できるように、getPropertyを使います。
			System.out.print(System.getProperty("line.separator"));
		}
	}