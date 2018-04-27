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

public class Services {

    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("xml/services.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Services");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;


                    String ServiceID = eElement.getElementsByTagName("ServiceID").item(0).getTextContent();

                    String ServiceType = eElement.getElementsByTagName("ServiceType").item(0).getTextContent();

                    String Price = eElement.getElementsByTagName("Price").item(0).getTextContent();




                    DbConnection(ServiceID,ServiceType,Price);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DbConnection(String ServiceID,String ServiceType,String Price) {
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
            String insert = "INSERT INTO Customers VALUES('"+ServiceID+" ',' "+ServiceType+" ',' "+Price+" ')";
            stmt.executeUpdate(insert);
			msg="Services are listed";
            System.out.println(msg);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
