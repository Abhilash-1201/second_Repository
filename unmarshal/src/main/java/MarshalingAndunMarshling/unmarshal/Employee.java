package MarshalingAndunMarshling.unmarshal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee 
{
	private int Eid;
	private String EmpName;
	private int Empsal;
	public Employee() {
		super();
	}
	public Employee(int eid, String empName, int empsal) {
		super();
		Eid = eid;
		EmpName = empName;
		Empsal = empsal;
	}
	@XmlAttribute
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	@XmlElement
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	@XmlElement
	public int getEmpsal() {
		return Empsal;
	}
	
	public void setEmpsal(int empsal) {
		Empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", EmpName=" + EmpName + ", Empsal=" + Empsal + "]";
	}
	
}
