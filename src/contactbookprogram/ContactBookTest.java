/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactbookprogram;

/**
 *
 * @author Vinit
 */

import static java.lang.System.exit; //exit import
import java.util.ArrayList; //array list import
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner; //input import


public class ContactBookTest {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        
        int n=1;
        while(n>0)
        {
            Iterator itr=contactList.iterator();
            System.out.println("1.Add  2.Delete  3.Display  4.Edit  5.Sort By FName  6.Sort By Zip  7.Exit");
            System.out.print("Enter the Choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: //add ontact 
                        System.out.print("Enter first name : ");
                        String fname = sc.next();
                        System.out.print("Enter last name : ");
                        String lname = sc.next();
                        System.out.print("Enter address : ");
                        String address = sc.next();
                        System.out.print("Enter city : ");
                        String city = sc.next();
                        System.out.print("Enter state name : ");
                        String state = sc.next();
                        System.out.print("Enter zip : ");
                        int zip = sc.nextInt();
                        System.out.print("Enter phone : ");
                        String phone = sc.next();
                        String s=String.valueOf(phone);
                        
                        Contact c = new Contact(fname, lname, address, city, state, zip, phone);
                        contactList.add(c);
                        
                        break;
            
                case 2: //delete contact
                        System.out.print("Enter contact index : ");
                        int index = sc.nextInt();
                        
                        contactList.remove(index);
                        break;
               
                case 3: //display contact
                        int r=0;//contact index
                        System.out.println("---------------------------");
                        while(itr.hasNext())
                        {  
                            System.out.print("contact number: "+ r++ +" --> ");
                            Contact stt=(Contact)itr.next();  
                            System.out.println(stt.fname+" "+stt.lname+" "+stt.address+" "+" "+stt.zip+" "+stt.phoneNumber);
                            //String s = stt.name;
                            //Collections.sort(s);
                        }
                        System.out.println("---------------------------");
                        break;
                        
                case 4: //field modificaion
                        System.out.print("Enter Contact Index: ");
                        int ind = sc.nextInt();
                        System.out.println("1.Lname  2.address  3.city  4.state  5.zip 6.phoneNumber");
                        System.out.print("Select the which filed you want to change:");
                        int opt = sc.nextInt();
                        
                        
                        if(opt == 1 )
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //last name modification
                            contactList.get(ind).setlName(value);
                        }
                        else if(opt == 2)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //address modification
                            contactList.get(ind).setaddress(value);
                        }
                        else if(opt == 3)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //city name modification
                            contactList.get(ind).setCity(value);
                        }
                        else if(opt == 4)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //state name modification
                            contactList.get(ind).setState(value);
                        }
                        else if(opt == 5)
                        {
                            System.out.print("Enter the value: ");
                            int value = sc.nextInt();
                            //zip modification
                            contactList.get(ind).setZip(value);
                        }
                        else if(opt == 6)
                        {
                            System.out.print("Enter the value: ");
                            String value = sc.next();
                            //phone number modification
                            contactList.get(ind).setphone(value);
                        }
                        else
                        {
                            System.out.println("Error");
                        }
                        System.out.println("UPDATED");
             
                        break;
                        
                case 5: //sort by first name
                        System.out.println("Sorted Successfully");
                        contactList.sort(Comparator.comparing(Contact::getfName));
                        break;
                        
                case 6: //sort by zip
                        System.out.println("Sorted Sucessfully");
                        contactList.sort(Comparator.comparingInt(Contact::getZip));
                        break;
                      
                case 7: //exit
                        System.out.println("Exited");
                        exit(0);
            
                default:System.out.println("Invalid Option");
                        break;
            }   
        }
    }
}

