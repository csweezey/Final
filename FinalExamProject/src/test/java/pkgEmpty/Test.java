package pkgEmpty;

import static org.junit.Assert.*;

import pkgCore.Retirement;

public class Test {

	@org.junit.Test
	public void TotalAmounSavedtest() {
		int iYearsToWork = 40;
		double dAnnualReturnWorking = .07;
		int iYearsRetired = 20;
		double dAnnualReturnRetired = .02;
		double dRequiredIncome = 10000;
		double dMonthlySSI = 2642;
		String StrExpectedTotal = "1454485.55";
		Retirement retirement = new Retirement(iYearsToWork, dAnnualReturnWorking, iYearsRetired, dAnnualReturnRetired, dRequiredIncome, dMonthlySSI);
		double dAmount = retirement.TotalAmountSaved();
		String StrAmount = String.format("%.2f", dAmount);
		
		assertEquals(StrExpectedTotal, StrAmount);
		
		double dAmountToSave = retirement.AmountToSave();
		String StrAmountToSave = String.format("%.2f", dAmountToSave);
		String StrExpectedToSave = "554.13";
	}

}
