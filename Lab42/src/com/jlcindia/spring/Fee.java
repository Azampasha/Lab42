package com.jlcindia.spring;

public class Fee {

	double totalfee;
	double feepaid;
	double feeBal;
//tttttttttttttt
	public Fee(double totalfee, double feepaid, double feeBal) {
		super();

		this.totalfee = totalfee;
		this.feepaid = feepaid;
		this.feeBal = feeBal;
	}

	public double getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}

	public double getFeepaid() {
		return feepaid;
	}

	public void setFeepaid(double feepaid) {
		this.feepaid = feepaid;
	}

	public double getFeeBal() {
		return feeBal;
	}

	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}
}