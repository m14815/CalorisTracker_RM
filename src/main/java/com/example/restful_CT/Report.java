package com.example.restful_CT;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "REPORTS")
public class Report {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "report_id")
    private long reportId;
    private Date date;
    private int TCC;// Total Calories Consumed
    private int TCB; //Total Calories Burned
    private int TS; //Total Steps
    private int CG; //Calories Goal
    @ManyToOne
    private Account account;
    public Report(){

    }
    public Report(long reportId){
        this.reportId = reportId;
    }

    public void setReportId(long reportId) {
        this.reportId = reportId;
    }

    public long getReportId() {
        return reportId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setCG(int CG) {
        this.CG = CG;
    }

    public int getCG() {
        return CG;
    }

    public void setTCB(int TCB) {
        this.TCB = TCB;
    }

    public int getTCB() {
        return TCB;
    }

    public void setTCC(int TCC) {
        this.TCC = TCC;
    }

    public int getTCC() {
        return TCC;
    }

    public void setTS(int TS) {
        this.TS = TS;
    }

    public int getTS() {
        return TS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;
        Report report = (Report) o;
        return reportId == report.reportId &&
                TCC == report.TCC &&
                TCB == report.TCB &&
                TS == report.TS &&
                CG == report.CG &&
                date.equals(report.date) &&
                account.equals(report.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, date, TCC, TCB, TS, CG, account);
    }

}
