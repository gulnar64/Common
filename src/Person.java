public abstract class Person implements  Cloneable{
   private int test;

   public int getTest() {
      return test;
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   public void setTest(int test) {
      this.test = test;
   }

   public abstract void getResponsibility(Person person);

}
