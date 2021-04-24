package MarshalingAndunMarshling.unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Done!!" );
        File file = new File("C://Users//abhisheknarayan//Desktop//Marshal//Employee.xml");
        try {
			JAXBContext jcontext = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshal = jcontext.createUnmarshaller();
			Employee emp = (Employee) unmarshal.unmarshal(file);
			System.out.println(emp.getEid()+" "+emp.getEmpName()+" "+emp.getEmpsal());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
