package HW_Java_6;

public class Notebook {
    private final String brand;
    private int ram;
    private String typeDrive;
    private int valueHDD;
    private final String color;
    private String operationSystem;
    private final int sizeDisplay;

    public Notebook(String brand, int ram,
                    int sizeDisplay, int valueHDD, String typeDrive,
                    String operationSystem, String color) {
        this.brand = brand;

        this.ram = ram;
        this.typeDrive = typeDrive;
        this.valueHDD = valueHDD;
        this.color = color;
        this.operationSystem = operationSystem;
        this.sizeDisplay = sizeDisplay;
    }

    public Notebook(String brand, int ram, int sizeDisplay) {
        this(brand, ram,
                sizeDisplay, 512, "SDD",
                "Windows 10", "White");
    }

    @Override
    public String toString() {
        return  String.format("Notebook  { brand = %-8s ram = %-5d\ttypeDrive = %s\tvalueHDD = %d\tcolor = %s\toperationSystem = %-10ssizeDisplay = %d}",brand, ram, typeDrive, valueHDD, color, operationSystem, sizeDisplay);
//        return "Notebook  {" +
//                "brand ='" + brand + '\'' +
//                ",\t\t\t ram =" + ram +
//                ", typeDrive ='" + typeDrive + '\'' +
//                ",\t\t valueHDD =" + valueHDD +
//                ", color ='" + color + '\'' +
//                ",\t\t operationSystem ='" + operationSystem + '\'' +
//                ",\t\t sizeDisplay =" + sizeDisplay +
//                '}';
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getSizeDisplay() {
        return sizeDisplay;
    }

    public int getValueHDD() {
        return valueHDD;
    }

    public String getTypeDrive() {
        return typeDrive;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setValueHDD(int valueHDD) {
        this.valueHDD = valueHDD;
    }

    public void setTypeDrive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


}
