public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1d : 0.85d;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000d * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return salary < 2000 ? salary : 2000d;
    } 
}
