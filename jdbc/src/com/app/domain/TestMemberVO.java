package com.app.domain;

public class TestMemberVO {
	private Long TestMemberId;
	private String TestMemberIdentification;
	private String TestMemberPassword;
	private String TestMemberName;
	private String TestMemberPhone;
	private String TestMemberNickname;
	private String TestMemberEmail;
	private String TestMemberAddress;
	private String TestMemberBirth;
	private String TestMemberRecommenderId;
	
	public TestMemberVO() {;}
	public Long getTestMemberId() {
		return TestMemberId;
	}
	public void setTestMemberId(Long testMemberId) {
		TestMemberId = testMemberId;
	}
	public String getTestMemberIdentification() {
		return TestMemberIdentification;
	}
	public void setTestMemberIdentification(String testMemberIdentification) {
		TestMemberIdentification = testMemberIdentification;
	}
	public String getTestMemberPassword() {
		return TestMemberPassword;
	}
	public void setTestMemberPassword(String testMemberPassword) {
		TestMemberPassword = testMemberPassword;
	}
	public String getTestMemberName() {
		return TestMemberName;
	}
	public void setTestMemberName(String testMemberName) {
		TestMemberName = testMemberName;
	}
	public String getTestMemberPhone() {
		return TestMemberPhone;
	}
	public void setTestMemberPhone(String testMemberPhone) {
		TestMemberPhone = testMemberPhone;
	}
	public String getTestMemberNickname() {
		return TestMemberNickname;
	}
	public void setTestMemberNickname(String testMemberNickname) {
		TestMemberNickname = testMemberNickname;
	}
	public String getTestMemberEmail() {
		return TestMemberEmail;
	}
	public void setTestMemberEmail(String testMemberEmail) {
		TestMemberEmail = testMemberEmail;
	}
	public String getTestMemberAddress() {
		return TestMemberAddress;
	}
	public void setTestMemberAddress(String testMemberAddress) {
		TestMemberAddress = testMemberAddress;
	}
	public String getTestMemberBirth() {
		return TestMemberBirth;
	}
	public void setTestMemberBirth(String testMemberBirth) {
		TestMemberBirth = testMemberBirth;
	}
	public String getTestMemberRecommenderId() {
		return TestMemberRecommenderId;
	}
	public void setTestMemberRecommenderId(String testMemberRecommenderId) {
		TestMemberRecommenderId = testMemberRecommenderId;
	}
	@Override
	public String toString() {
		return "TestMemberVO [TestMemberId=" + TestMemberId + ", TestMemberIdentification=" + TestMemberIdentification
				+ ", TestMemberPassword=" + TestMemberPassword + ", TestMemberName=" + TestMemberName
				+ ", TestMemberPhone=" + TestMemberPhone + ", TestMemberNickname=" + TestMemberNickname
				+ ", TestMemberEmail=" + TestMemberEmail + ", TestMemberAddress=" + TestMemberAddress
				+ ", TestMemberBirth=" + TestMemberBirth + ", TestMemberRecommenderId=" + TestMemberRecommenderId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TestMemberId == null) ? 0 : TestMemberId.hashCode());
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
		TestMemberVO other = (TestMemberVO) obj;
		if (TestMemberId == null) {
			if (other.TestMemberId != null)
				return false;
		} else if (!TestMemberId.equals(other.TestMemberId))
			return false;
		return true;
	}
	
	
}
