public class SmartWatch{
    public static void main(String args[]) {
        SmartWatch watch = new SmartWatch();
        watch.walk(10);
        System.out.println(watch.getSteps());

        watch.walk(-10);
        System.out.println(watch.getSteps());
    }
    private int stepCount;

    public void walk(int steps){
        if(steps < 0) {
            System.out.println("No Negative Steps");
        }else{
            this.stepCount += steps;
        }
    }

    public int getSteps(){
        return this.stepCount;
    }

    SmartWatch(){
        this.stepCount = 0;
    }
}