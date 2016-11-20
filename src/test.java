public class test
{

	public static void main(String[] args) {

		String version = "DKY13";
	    String newVersion = "DKY" + (Integer.parseInt(version.substring(3,version.length()))-1);
	    System.out.println("newop:"+newVersion);

	    String version2 = "v10";
	    System.out.println("v" + (Integer.parseInt(version2.replaceAll("[^0-9]", "")) - 1));
	    
	    
	    String oldVersion = "v13";
	    String[] splitString = oldVersion.split("v");
	    int newVersions = Integer.valueOf(splitString[1])-1;
	    String completeNewVersion = splitString[0] + newVersions;
	    System.out.print("v"+completeNewVersion);

	}

}
