package com.example.vms.entity;


public class VendorDetails {


    private int id;

    private String loginId;

    private String visitorType;

    private String visitorName;

    private String visitorEmail;

    private String qrCode;

    private String inTime;

    private String outTime;

    private String refEmpId;

    private String refEmpMail;

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

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }


    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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

    @Override
    public String toString() {
        return "VendorDetails [id=" + id + ", loginId=" + loginId + ", visitorType=" + visitorType + ", visitorName="
                + visitorName + ", visitorEmail=" + visitorEmail + ", qrCode=" + qrCode + ", inTime=" + inTime
                + ", outTime=" + outTime + ", refEmpId=" + refEmpId + ", refEmpMail=" + refEmpMail + ", empStatus="
                + empStatus + ", lastModificationDate=" + lastModificationDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empStatus == null) ? 0 : empStatus.hashCode());
        result = prime * result + id;
        result = prime * result + ((inTime == null) ? 0 : inTime.hashCode());
        result = prime * result + ((lastModificationDate == null) ? 0 : lastModificationDate.hashCode());
        result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
        result = prime * result + ((outTime == null) ? 0 : outTime.hashCode());
        result = prime * result + ((qrCode == null) ? 0 : qrCode.hashCode());
        result = prime * result + ((refEmpId == null) ? 0 : refEmpId.hashCode());
        result = prime * result + ((refEmpMail == null) ? 0 : refEmpMail.hashCode());
        result = prime * result + ((visitorEmail == null) ? 0 : visitorEmail.hashCode());
        result = prime * result + ((visitorName == null) ? 0 : visitorName.hashCode());
        result = prime * result + ((visitorType == null) ? 0 : visitorType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VendorDetails other = (VendorDetails) obj;
        if (empStatus == null) {
            if (other.empStatus != null)
                return false;
        } else if (!empStatus.equals(other.empStatus))
            return false;
        if (id != other.id)
            return false;
        if (inTime == null) {
            if (other.inTime != null)
                return false;
        } else if (!inTime.equals(other.inTime))
            return false;
        if (lastModificationDate == null) {
            if (other.lastModificationDate != null)
                return false;
        } else if (!lastModificationDate.equals(other.lastModificationDate))
            return false;
        if (loginId == null) {
            if (other.loginId != null)
                return false;
        } else if (!loginId.equals(other.loginId))
            return false;
        if (outTime == null) {
            if (other.outTime != null)
                return false;
        } else if (!outTime.equals(other.outTime))
            return false;
        if (qrCode == null) {
            if (other.qrCode != null)
                return false;
        } else if (!qrCode.equals(other.qrCode))
            return false;
        if (refEmpId == null) {
            if (other.refEmpId != null)
                return false;
        } else if (!refEmpId.equals(other.refEmpId))
            return false;
        if (refEmpMail == null) {
            if (other.refEmpMail != null)
                return false;
        } else if (!refEmpMail.equals(other.refEmpMail))
            return false;
        if (visitorEmail == null) {
            if (other.visitorEmail != null)
                return false;
        } else if (!visitorEmail.equals(other.visitorEmail))
            return false;
        if (visitorName == null) {
            if (other.visitorName != null)
                return false;
        } else if (!visitorName.equals(other.visitorName))
            return false;
        if (visitorType == null) {
            if (other.visitorType != null)
                return false;
        } else if (!visitorType.equals(other.visitorType))
            return false;
        return true;
    }

}