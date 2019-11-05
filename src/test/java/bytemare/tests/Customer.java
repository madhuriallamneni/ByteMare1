package bytemare.tests;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private Date dob;
	private String ssn;
	
		//POJO
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lasstName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lasstName the lasstName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the dob
	 */
	public CharSequence[] getDob() {
		CharSequence[] date = null;
		return date;
	}
	public Date setDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setDob(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

}
