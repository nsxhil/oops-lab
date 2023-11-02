/* Imagine a company that markets both hardware and software. Create an interface
that will be implemented by two classes hardware and software, where hardware
item holds the category of item and its original manufacturer and software holds
type of software and operating system under which it works. Calculate the total
sales for hardware as well as software item recorded for last 3months */


interface Product {
    double calculateTotalSales();
}


class Hardware implements Product {
    private String category;
    private String manufacturer;
    private double[] salesData;

    public Hardware(String category, String manufacturer, double[] salesData) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.salesData = salesData;
    }

    
    public double calculateTotalSales() {
        double totalSales = 0.0;
        for (double sales : salesData) {
            totalSales += sales;
        }
        return totalSales;
    }
}

class Software implements Product {
    private String type;
    private String operatingSystem;
    private double[] salesData;

    public Software(String type, String operatingSystem, double[] salesData) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.salesData = salesData;
    }

    @Override
    public double calculateTotalSales() {
        double totalSales = 0.0;
        for (double sales : salesData) {
            totalSales += sales;
        }
        return totalSales;
    }
}

public class hardsoft {
    public static void main(String[] args) {
        
        double[] hardwareSales = {1000.0, 1500.0, 2000.0};
        double[] softwareSales = {800.0, 1200.0, 1800.0};
        
        Hardware hardwareItem = new Hardware("Laptop", "Manufacturer A", hardwareSales);
        Software softwareItem = new Software("Antivirus", "Windows", softwareSales);
       
        double totalHardwareSales = hardwareItem.calculateTotalSales();
        double totalSoftwareSales = softwareItem.calculateTotalSales();

        System.out.println("Total Hardware Sales for the Last 3 Months: Rs" + totalHardwareSales);
        System.out.println("Total Software Sales for the Last 3 Months: Rs" + totalSoftwareSales);
    }
}
