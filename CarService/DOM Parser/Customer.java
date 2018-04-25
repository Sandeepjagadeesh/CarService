package domParser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer {

    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("xml/customers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Customer");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;


                    String CustID = eElement.getElementsByTagName("CustID").item(0).getTextContent();

                    String Email = eElement.getElementsByTagName("Email").item(0).getTextContent();

                    String Mobile = eElement.getElementsByTagName("Mobile").item(0).getTextContent();

                    String Password = eElement.getElementsByTagName("Password").item(0).getTextContent();




                    DbConnection(CustID,Email,Mobile,Password);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DbConnection(String CustID,String Email,String Mobile,String Password) {
        Connection con = null;
        String DB_URL = "jdbc:mysql://localhost:3306/project515";
        String USER_OrderDate = "root";
        String PASSWORD = "ultrasafesystem";
        String msg = "";

       // double fax1 = Double.parseDouble(fax);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER_OrderDate, PASSWORD);

            Statement stmt = con.createStatement();
            String insert = "INSERT INTO Customers VALUES('"+CustID+" ',' "+Email+" ',' "+Mobile+" ',' "+Password+" ')";
            stmt.executeUpdate(insert);
			msg="Customer are added successfully";
            System.out.println(msg);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
