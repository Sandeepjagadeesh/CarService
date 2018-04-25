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

public class Cars {

    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("xml/cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Cars");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;


                    String CarID = eElement.getElementsByTagName("CarID").item(0).getTextContent();

                    String Make = eElement.getElementsByTagName("Make").item(0).getTextContent();

                    String Model = eElement.getElementsByTagName("Model").item(0).getTextContent();

                    String Year = eElement.getElementsByTagName("Year").item(0).getTextContent();

                    String Color = eElement.getElementsByTagName("Color").item(0).getTextContent();

                    String Type = eElement.getElementsByTagName("Type").item(0).getTextContent();

                    String LicPlate = eElement.getElementsByTagName("LicPlate").item(0).getTextContent();

                    String Price = eElement.getElementsByTagName("Price").item(0).getTextContent();


                    DbConnection(CarID,Make,Model,Year,Color,Type,LicPlate,Price);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DbConnection(String CarID,String Make,String Model,String Year,String Color,String Type,String LicPlate,String Price) {
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
            String insert = "INSERT INTO Customers VALUES('"+CarID+" ',' "+Make+" ',' "+Model+" ',' "+Year+" ',' "+Color+" ',' "+Type+" ',' "+LicPlate+" ',' "+Price+" ')";
            stmt.executeUpdate(insert);
			msg="Cars are added successfully";
            System.out.println(msg);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
