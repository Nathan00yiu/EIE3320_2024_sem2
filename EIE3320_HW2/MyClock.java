//HW2. Q2. Name: Lam Ching Yiu ID: 21093734d
//Tool: VScode
//Do not change the main but please do testing by changing the input number of ClockDisplay()
public class MyClock
{
 public static void main(String[] args) {
 ClockDisplay hkTime = new ClockDisplay(11,59);
 ClockDisplay londonTime = new ClockDisplay(10,30);
 hkTime.timeTick();
 londonTime.timeTick();
 System.out.println(hkTime.getTime());
 System.out.println(londonTime.getTime());
 }
}