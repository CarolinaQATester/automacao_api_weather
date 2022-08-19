package com.automacaoapi;

public class Forecast
{
    private String date;

    private String condition;

    private String min;

    private String max;

    private String weekday;

    private String description;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getCondition ()
    {
        return condition;
    }

    public void setCondition (String condition)
    {
        this.condition = condition;
    }

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMax ()
    {
        return max;
    }

    public void setMax (String max)
    {
        this.max = max;
    }

    public String getWeekday ()
    {
        return weekday;
    }

    public void setWeekday (String weekday)
    {
        this.weekday = weekday;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", condition = "+condition+", min = "+min+", max = "+max+", weekday = "+weekday+", description = "+description+"]";
    }
}
			
	