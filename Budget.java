// Budget basics
class Budget {
	
	/* Instance variable */

	// incomes
	Income[] incomes;

	// expenses
	Expense[] expenses;

	// final status
	Double finalStatus;


	// initialization 
	public Budget() {

	}
	
	// update data 
	public void updateVariables(Income[] incomeList, Expense[] expenseList) {
		incomes = incomeList;
		expenses = expenseList;
	}

	// make calculations
	public void calculateFinalStatus() {

		// find sum of incomes
		Double sumOfIncomes = 0.0;
		for (int i = 0; i < incomes.length; i++) {
			Income income = incomes[i];
			sumOfIncomes = sumOfIncomes + income.amount;
		}

		// find sum of expenses
		Double sumOfExpenses = 0.0;
		for (int i = 0; i < expenses.length; i++) {
			Expense expense = expenses[i];
			sumOfExpenses = sumOfExpenses + expense.amount;
		}

		// calculate final status
		finalStatus = sumOfIncomes - sumOfExpenses;

	}

	public static void main(String[] args) {

		// create income list
		Income[] incomeArray = new Income[2];
		Income i1 = new Income();
		i1.name = "Maas";
		i1.amount = 2000.0;

		Income i2 = new Income();
		i2.name = "Ek ders ucreti";
		i2.amount = 200.0;

		incomeArray[0] = i1;
		incomeArray[1] = i2;


		// create expnse list
		Expense[] expenseArray = new Expense[1];
		Expense e1 = new Expense();
		e1.name = "Icki";
		e1.amount = 3000.0;

		expenseArray[0] = e1;

		Budget bud = new Budget();
		
		bud.updateVariables(incomeArray, expenseArray);

		bud.calculateFinalStatus();

		// print result
		System.out.println(bud.finalStatus);

	}

}


class Expense {
	String name;
	Double amount; 
}

class Income {
	String name;
	Double amount; 
}

