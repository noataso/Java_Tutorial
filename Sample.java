public class Sample {
    String name;
    int engScore;
    int mathScore;

    void setData(String n){
        name=n;
    }
    void setData(String n,int e,int m){
        name=n;
        engScore=e;
        mathScore=m;
    }
    void setScore(int e,int m){
        engScore=e;
        mathScore=m;
    }
    void setModel(int e,int m){
        for(int i=0;i<3;i++){
            System.out.println(name+"さんは"+engScore+"点と"+mathScore+"点です");
        }
    }
    void display(){
        System.out.println(name+"さんこんにちは");
        System.out.println(engScore+"点と"+mathScore+"点です");
    }
}
