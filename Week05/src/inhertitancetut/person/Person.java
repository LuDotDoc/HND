package inhertitancetut.person;

import java.io.IOException;

/*************************************************************************
 *                           Luke Docwra 17019043                         *
 *                             2020 HND Tutorial                          *
 *                               inhertitancetut.person                          *
 *************************************************************************/

public class Person {
    private String personsName;
    private String personsAddress;
    int personsAge;

    public void getPersonName(String gName) {
        personsName = gName;
    }

    public void getPersonAddress(String gAddress)   {
        personsAddress = gAddress;
    }

    public void getPersonAge(int gAge)  {
        personsAge = gAge;
    }

    public void displayDetails() throws IOException {
        System.out.println("Person's name is : " + personsName);
        System.out.println("Person's address is : " + personsAddress);
        System.out.println("Person's age is : " + personsAge);

    }
}

                                                                           
