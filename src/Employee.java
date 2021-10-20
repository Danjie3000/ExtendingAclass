public class Employee { // Superclass. "Object/forældre".
  // Classerne her SKAL være public før subclasserne kan hente dem.
  // En constructor kan heller ikke blive arvet fra superclassen.

  public int getHours() {
    return 40;
  }

  public double getSalary() {
    return 40000.0 + 10000; // De + 10.000 er som bonus.
  }

  public int getVacationDays() {
    return 10;
  }

  public String getVacationForm() {
    return "yellow";
  }

/*// For at en Subclass' constructor skal virke, skal den kalde Superclassen's constructor.
  public static class Secretary extends Employee { // Subclass
    public void takeDictation(String text) {
      System.out.println("Dictation text: " + text);
    }
  }

  public static class Lawyer extends Employee { // Subclass
    // Overrider getVacationDays fra Employee classen.
    // En god ide er at sætte en @Override over det som der overrider. Så det nemmere at holde styr på.
    @Override
    public int getVacationDays() {
      return 15;
    }

    // Overrider getVacationForm fra Employee classen.
    public String getVacationForm() {
      return "pink";
    }

    public double getSalary() {
      return super.getSalary() + 10000; // super foran .getSalary gør så den altid vil få lønnen fra Superclassen.
      // Dette gør så man henter lønnen fra employee men samtidig sætter 10.000 oven i, da
      // advokaten får mere i løn. plus de 10.000 de alle har fået i bonus.
    }

    // Dette er det som advokaten kan mere iforhold til employee.
    public void sue() {
      System.out.println("I'll see you in court!");
    }
  }

  // En classe som er sub til en subclass. Dette er da den matcher en subclass men kan lidt mere til.
  public static class LegalSecretary extends Secretary { // Subclass af en Subclass.
    // Legal secretary får mere i løn, så den overrider lønnen i Secretary.
    public double getSalary() {
      return super.getSalary() + 5000;
      // Dette gør så man henter lønnen fra employee men samtidig sætter 5000 oven i, da
      // Legal Secretary får mere i løn. plus de 10.000 de alle har fået i bonus.
    }

    // En ny behavior tilføjes også.
    public void fileLegalBriefs() {
      System.out.println("I could file all day!");
    }
  }*/
}

