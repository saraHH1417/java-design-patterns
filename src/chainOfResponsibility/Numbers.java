package src.chainOfResponsibility;

public class Numbers {
    private int num1;
    private int num2;
    private String operationName;

    public Numbers(int num1, int num2, String operationName) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationName = operationName;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
}
