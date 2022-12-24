public class Tutorial {
    int[] engScore={80,90,100};
    String[] name={"菅原","藤本","java"};
    int[] mathScore=new int[3];

    Tutorial(int m0,int m1,int m2){
        mathScore[0]=m0;
        mathScore[1]=m1;
        mathScore[2]=m2;
    }

    // void setScore(int m0,int m1,int m2){
    //     mathScore[0]=m0;
    //     mathScore[1]=m1;
    //     mathScore[2]=m2;
    // }


    void display(){
        for(int i=0;i<3;i++){
            System.out.println(name[i]+"さんは"+engScore[i]+"点と"+mathScore[i]+"点です");
        }
        System.out.println("受験者数"+engScore.length+"名");
    }
}
