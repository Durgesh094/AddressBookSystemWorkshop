package org.briz;
/*
 Test Cases For Address Book Management System :
  Check for valid contact list
  should check valid contact or not
 */
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookSystemTest {
    @Test
    public void providedContact_ShouldValidContactorNot (){
        List<Contact> ContactList=new ArrayList();
        Contact Contact=new Contact("Durgesh","Chavan","Nsk","Nsk","MH",422010,787533,"dbc@gmail.com");
        ContactList.add(Contact);

        Contact expectedResult = ContactList.get(0);

        Assert.assertEquals(Contact,expectedResult);


    }
}
