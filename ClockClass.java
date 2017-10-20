
import java.time.Clock;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* **********************************************************
 * Programmer:	Erika Tvaskis
 * Class:		CS30S
 * Assignment:	circle example
 * Description:	creating and using circle objects 
 * *************************************************************
 */
 
 public class ClockClass
 {  // begin class

//CLASS VARIABLES

     private static int tick = 1;
     
//INSTANCE VARIABLES
     
     private int Hour;
     private int Minute;
     private int Second;
     
     
//CONSTRUCTORS
     
/****************************************************************************
  * Purpose:    Creates Time with set properties
  * Interface:
  * In:         None
  * Out:        None
*****************************************************************************/
    public ClockClass(){
         Hour = 0;
         Minute = 0;
         Second = 0;
    }  //End of default constructor
    
/****************************************************************************
  * Purpose:    Creates Hour, Minute, and Second with initialized properties
  * Interface:
  * In:         int Hour, Minute, and Second
  * Out:        none
*****************************************************************************/
    public ClockClass (int H, int M, int S) {
         Hour = H;
         Minute = M;
         Second = S;
    }  //End of initialized constructor
     
/****************************************************************************
  * Purpose:    Formats Hour, Minute, and Second
  * Interface:
  * In:         int Hour, Minute, and Second
  * Out:        Formatted Hour, Minute, and Second as String
*****************************************************************************/    
    public String toMilitary(){
         return String.format("%02d:%02d:%02d", Hour, Minute, Second);
    }  //End of initialized constructor
  
//MUTATORS
    
/****************************************************************************
  * Purpose:    Sets Hour, Minute, and Second (with specific requirements)
  * Interface:
  * In:         int Hour, Minute, and Second
  * Out:        none
*****************************************************************************/
    public void setTime(int H, int M, int S) {
        Calendar cal = new GregorianCalendar();
         Hour = cal.get(Calendar.HOUR);
         Minute = cal.get(Calendar.MINUTE);
         Second = cal.get(Calendar.SECOND);
    }  //End of initialized constructor
    
     public void setAlarmTime(int H, int M, int S) {
         Hour = ((H>=0 && H<24) ? H:0);
         Minute = ((M>=0 && M<24) ? M:0);
         Second = ((S>=0 && S<24) ? S:0);
    }  //End of initialized constructor
     
}
