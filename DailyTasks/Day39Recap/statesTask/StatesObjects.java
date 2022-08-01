package DailyTasks.Day39Recap.statesTask;

public class StatesObjects {

    public static void main(String[] args) {

        Virginia virginia=new Virginia("VA","Democrats","Democrat","Republican",20000000,3.1);

        virginia.setGovernor("Republican");
        System.out.println(virginia);

        System.out.println("***************************************************************************************");

        California california=new California("CA","Democrats","Democrats","Democrats",5000000,4.5);

        System.out.println(california);

        System.out.println("*****************************************************************************************");

        Texas texas=new Texas("TX","Republican","Republican","Republican",6000000,2.4);

        System.out.println(texas);

        System.out.println("****************************************************************************************");

        Florida florida=new Florida("FL","Republican","Republican","Democrats",8000000,6.1);

        System.out.println(florida);



    }

}
