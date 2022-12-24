public class GetSample {
    public static void main(String[] args) {
        Sample sam1=new Sample();
        Sample sam2=new Sample();

        sam1.setData("菅原",80,90);
        sam2.setData("菅原");
        sam2.setScore(90,80);
        sam1.setModel(70,30);
        sam1.display();
        sam2.display();
    }
}
