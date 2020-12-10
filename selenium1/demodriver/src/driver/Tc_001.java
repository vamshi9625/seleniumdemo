package driver;

public class Tc_001 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		 init();
		launch("firefoxbrowser");
	
		navigateUrl("bestbuyurl");

}
}