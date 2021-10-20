public class Lawyer extends Employee { // Subclass
  // Overrider getVacationDays fra Employee classen.
  // En god ide er at sætte en @Override over det som der overrider. Så det nemmere at holde styr på.
  @Override // Dette behøver man dog ikke at skrive.
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
