package pkgApp.controller;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnPay;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnWithdrawal;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label lblSaveEveryMonth;
	
	@FXML
	private Label lblAmountNeededToSave;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
		txtYearsToWork.setText("");
		txtAnnualReturnPay.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnWithdrawal.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		lblSaveEveryMonth.setText("");
		lblAmountNeededToSave.setText("");
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		Retirement retirement = new Retirement(Integer.parseInt(txtYearsToWork.getText()), Double.parseDouble(txtAnnualReturnPay.getText()), Integer.parseInt(txtYearsRetired.getText()), Double.parseDouble(txtAnnualReturnWithdrawal.getText()), Double.parseDouble(txtRequiredIncome.getText()), Double.parseDouble(txtMonthlySSI.getText()));
		double dAmountNeededToSave = retirement.TotalAmountSaved();
		String StrAmountNeededToSave = String.format("%.2f", dAmountNeededToSave);
		double dSaveEveryMonth = retirement.AmountToSave();
		String StrSaveEveryMonth = String.format("%.2f", dSaveEveryMonth);
		lblSaveEveryMonth.setText(StrSaveEveryMonth);
		System.out.println(StrSaveEveryMonth);
		lblAmountNeededToSave.setText(StrAmountNeededToSave);
		System.out.println(StrAmountNeededToSave);
	}
	
}
