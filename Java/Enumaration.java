public class Enumaration {
    enum DayOfweek{
        Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Sataurday(6),Sunday(7);
        public int val;
        DayOfweek(int val){
            this.val=val;
        
        }
        boolean isWorkDay(){
            if(val<6)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) {
        DayOfweek Day;
        System.out.println("Verification of sunday (isWorkDay())");
        System.out.println(DayOfweek.Sunday.isWorkDay());
        System.out.println("Verification of wednesday(isWorkDay()");
        System.out.println(DayOfweek.Wednesday.isWorkDay());
    }
    
}