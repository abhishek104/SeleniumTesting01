
public class test2 {

	public static void main(String[] args) {

		int rsize=12;
		String[] myFirstStringArray = new String[rsize-2];
		int size = myFirstStringArray.length;
		//System.out.println("size string: "+size);

		String s=null;
		s="ghj";
		
		int a = 0;
		for (int i=2; i<=4; i++){
			for (int j=1; j<=3; j++)
			{
				if(s!=null){
				myFirstStringArray[a]="Text"+i+""+j+"";
				a++;
				}
			}}


		for (int h=0; h<size-1; h++)
		{
			System.out.println("Text ="+myFirstStringArray[h]);
		}
	}
}
