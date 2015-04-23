package license;

public class license {
	private int InitialLicenseNum =0;
	private int CalculateNum =0;
	public boolean JudgeServiceRequest()
	{
		CalculateNum+=1;
		if (CalculateNum<=InitialLicenseNum) return true;
		else return false;		
	}
}
