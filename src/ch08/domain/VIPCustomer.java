package ch08.domain;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID ) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.01;
        this.agentID = agentID;
        System.out.println("VIPCustomer( ) 생성자 호출");
    }

    public int getAgentID( ) {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }


    public String showVIPInfo( ) {
        return super.showCustomerInfo() + "담당 상담원의 아이디는" + agentID + "입니다.";
    }
}
