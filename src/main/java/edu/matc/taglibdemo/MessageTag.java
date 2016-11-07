package edu.matc.taglibdemo;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by gunther on 11/1/16.
 */
public class MessageTag extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        LocalDateTime dateTime = new LocalDateTime();

        int month = dateTime.getMonthOfYear();
        int day = dateTime.getDayOfMonth();

        int hour = dateTime.getHourOfDay();

        if(month == 10 && day == 31){
            out.println("Happy Halloween!");
        } else if (hour < 12){
            out.println("Good morning!");
        } else if (hour < 17){
            out.println("Good afternoon!");
        } else {
            out.println("Good evening!");
        }



    }
}
