public class Manager {
    final int NUM=100;
private Transcation[] transactions=new Transcation[NUM];
private Person[] persons=new Person[NUM];




    public void displayTransactions(){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<transactions.length;i++)
            if(transactions[i]!=null)
                str.append(transactions[i]+"\n");

        System.out.println("----List of Transactions----");
        System.out.println(str.toString());
    }
    public void displayPersons(){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<persons.length;i++)
            if(persons[i]!=null)
                str.append(persons[i]+"\n");

        System.out.println("----List of Persons----");
        System.out.println(str.toString());
    }

    public void addTransaction(Transcation t) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null)
                transactions[i] = t;
            System.out.println("----Transaction added successfully----");
            break;
        }
    }

    public void removeTransaction(Transcation t) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i]==t) {
                transactions[i] = null;
                System.out.println("----Transaction Removed successfully");
                break;
            }
        }
    }

    public void addPerson(Person t) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null)
                persons[i] = t;
            System.out.println("----Person added successfully----");
            break;
        }
    }

    public void removePerson(Person t) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]==t) {
                persons[i] = null;
                System.out.println("----Person Removed successfully");
                break;
            }
        }
    }










public Manager(){}

    public Person[] getPersons() {
        return persons;
    }

    public Transcation[] getTransactions() {
        return transactions;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void setTransactions(Transcation[] transactions) {
        this.transactions = transactions;
    }
}
