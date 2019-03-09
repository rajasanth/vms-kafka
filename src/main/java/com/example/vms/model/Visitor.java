package com.example.vms.model;

import com.example.vms.entity.VendorDetails;

public class Visitor {

    private int id;

    private String loginId;

    private String visitorType;

    private String visitorName;

    private String visitorEmail;

    private String inTime;

    private String outTime;

    private String refEmpId;

    private String refEmpMail;

    private String qrCode;

    public String getVisitorEmail() {
        return visitorEmail;
    }


    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }


    private String empStatus;

    private String lastModificationDate;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getLoginId() {
        return loginId;
    }


    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }


    public String getVisitorType() {
        return visitorType;
    }


    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }


    public String getVisitorName() {
        return visitorName;
    }


    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }


    public String getInTime() {
        return inTime;
    }


    public void setInTime(String inTime) {
        this.inTime = inTime;
    }


    public String getOutTime() {
        return outTime;
    }


    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }


    public String getRefEmpId() {
        return refEmpId;
    }


    public void setRefEmpId(String refEmpId) {
        this.refEmpId = refEmpId;
    }


    public String getRefEmpMail() {
        return refEmpMail;
    }


    public void setRefEmpMail(String refEmpMail) {
        this.refEmpMail = refEmpMail;
    }


    public String getEmpStatus() {
        return empStatus;
    }


    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }


    public String getLastModificationDate() {
        return lastModificationDate;
    }


    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }


    public String getQrCode() {
        return qrCode;
    }


    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }


    public VendorDetails toVendorEntity(Visitor visitor) {
        VendorDetails returnObj = new VendorDetails();
        returnObj.setEmpStatus(visitor.getEmpStatus());
        returnObj.setId(visitor.getId());
        returnObj.setInTime(visitor.getInTime());
        returnObj.setLastModificationDate(visitor.getLastModificationDate());
        returnObj.setLoginId(visitor.getLoginId());
        returnObj.setOutTime(visitor.getOutTime());
        returnObj.setRefEmpId(visitor.getRefEmpId());
        returnObj.setRefEmpMail(visitor.getRefEmpMail());
        returnObj.setVisitorName(visitor.getVisitorName());
        returnObj.setVisitorType(visitor.getVisitorType());
        returnObj.setQrCode(visitor.getQrCode());
        returnObj.setVisitorEmail(visitor.getVisitorEmail());
        return returnObj;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", visitorType='" + visitorType + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", visitorEmail='" + visitorEmail + '\'' +
                ", inTime='" + inTime + '\'' +
                ", outTime='" + outTime + '\'' +
                ", refEmpId='" + refEmpId + '\'' +
                ", refEmpMail='" + refEmpMail + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", empStatus='" + empStatus + '\'' +
                ", lastModificationDate='" + lastModificationDate + '\'' +
                '}';
    }

}