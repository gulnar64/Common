public record StudentRecord(int id, String name, String surname) {
    public StudentRecord() {
        this(1, "Gulnar", "Surname");
    }

    public static int i = 5;

    public void recordMethod() {
        System.out.println("record method, id = " + id);
    }

    static public void recordMethodStatic() {
        StudentRecord studentRecord = new StudentRecord(7, "Xanlar", "XXX");
        System.out.println("record method, i = " + studentRecord.id());
    }
}
