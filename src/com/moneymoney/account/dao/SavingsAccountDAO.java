package com.moneymoney.account.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.exception.AccountNotFoundException;

public interface SavingsAccountDAO {

	SavingsAccount createNewAccount(SavingsAccount account)
			throws ClassNotFoundException, SQLException;

	SavingsAccount updateAccount(SavingsAccount account);

	SavingsAccount getAccountById(int accountNumber)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	SavingsAccount deleteAccount(int accountNumber)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	SavingsAccount getAccountByName(String accountHolderName)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	List<SavingsAccount> getAccountByBalance(double minmumBalance,
			double maximumBalance) throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	double checkAccountBalance(int accountNumber)
			throws AccountNotFoundException, ClassNotFoundException,
			SQLException;

	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException,
			SQLException;

	void updateBalance(int accountNumber, double currentBalance)
			throws ClassNotFoundException, SQLException;

	SavingsAccount updateAccount(int accountNumber, int userChoice,
			String nameORSalary) throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortAllSavingsAccount(int choice)
			throws ClassNotFoundException, SQLException;
	
	void commit() throws SQLException;

	

}
