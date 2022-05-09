class Student {
  String id;   // 学籍番号
  String name; // 名前
  int grade;   // 成績

  void print() {
    System.out.println("ID   : " + id);  
    System.out.println("Name : " + name);
    System.out.println("Grade: " + grade);
  }
}

class Main2 {
  public static void main(String[] args) {
    Student st  = new Student();
    Student st2 = new Student();
    st.id    =  "01110"; st2.id    =  "01111";
    st.name  = "Suzuki"; st2.name  = "Yamada";
    st.grade =      100; st2.grade =       80;

    st.print();       
    st2.print();
  }
}
