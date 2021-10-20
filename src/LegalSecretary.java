public class LegalSecretary  extends Secretary { // Subclass af en Subclass.
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
}
