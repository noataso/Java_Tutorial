class Student4{
    String name;
    int counter=0;

    Student4(String n){
        name=n;
        counter++;
        System.out.println(name+"さんをインスタンス化しました");
    }
    void display(){
        System.out.println(counter+"人です");
    }
}