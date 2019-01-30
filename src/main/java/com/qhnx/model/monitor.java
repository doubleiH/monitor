package com.qhnx.model;





public class monitor  {
    private Integer ID;
    private String ClientDate;
    private String ClientTime;
    private String TranCode;
    private String ClientTraceNum;
    private String AccountNo;
    private String AccountNo2;
    private Integer TranAmt;
    private String TspRetCode;
    private String Remark1;
    private String Remark2;

    public monitor() {
    }

    public monitor(Integer ID, String clientDate, String clientTime, String tranCode, String clientTraceNum, String accountNo, String accountNo2, Integer tranAmt, String tspRetCode, String remark1, String remark2) {
        this.ID = ID;
        ClientDate = clientDate;
        ClientTime = clientTime;
        TranCode = tranCode;
        ClientTraceNum = clientTraceNum;
        AccountNo = accountNo;
        AccountNo2 = accountNo2;
        TranAmt = tranAmt;
        TspRetCode = tspRetCode;
        Remark1 = remark1;
        Remark2 = remark2;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getClientDate() {
        return ClientDate;
    }

    public void setClientDate(String clientDate) {
        ClientDate = clientDate;
    }

    public String getClientTime() {
        return ClientTime;
    }

    public void setClientTime(String clientTime) {
        ClientTime = clientTime;
    }

    public String getTranCode() {
        return TranCode;
    }

    public void setTranCode(String tranCode) {
        TranCode = tranCode;
    }

    public String getClientTraceNum() {
        return ClientTraceNum;
    }

    public void setClientTraceNum(String clientTraceNum) {
        ClientTraceNum = clientTraceNum;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getAccountNo2() {
        return AccountNo2;
    }

    public void setAccountNo2(String accountNo2) {
        AccountNo2 = accountNo2;
    }

    public Integer getTranAmt() {
        return TranAmt;
    }

    public void setTranAmt(Integer tranAmt) {
        TranAmt = tranAmt;
    }

    public String getTspRetCode() {
        return TspRetCode;
    }

    public void setTspRetCode(String tspRetCode) {
        TspRetCode = tspRetCode;
    }

    public String getRemark1() {
        return Remark1;
    }

    public void setRemark1(String remark1) {
        Remark1 = remark1;
    }

    public String getRemark2() {
        return Remark2;
    }

    public void setRemark2(String remark2) {
        Remark2 = remark2;
    }


    @Override
    public String toString() {
        return "monitor{" +
                "ID=" + ID +
                ", ClientDate='" + ClientDate + '\'' +
                ", ClientTime='" + ClientTime + '\'' +
                ", TranCode='" + TranCode + '\'' +
                ", ClientTraceNum='" + ClientTraceNum + '\'' +
                ", AccountNo='" + AccountNo + '\'' +
                ", AccountNo2='" + AccountNo2 + '\'' +
                ", TranAmt=" + TranAmt +
                ", TspRetCode='" + TspRetCode + '\'' +
                ", Remark1='" + Remark1 + '\'' +
                ", Remark2='" + Remark2 + '\'' +
                '}';
    }
}
