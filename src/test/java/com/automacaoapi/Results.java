package com.automacaoapi;

public class Results
{
    private String date;

    private String temp;

    private String sunrise;

    private String city;

    private String description;

    private String img_id;

    private Forecast[] forecast;

    private String city_name;

    private String currently;

    private String sunset;

    private String humidity;

    private String condition_slug;

    private String time;

    private String wind_speedy;

    private String condition_code;

    private String cid;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getTemp ()
    {
        return temp;
    }

    public void setTemp (String temp)
    {
        this.temp = temp;
    }

    public String getSunrise ()
    {
        return sunrise;
    }

    public void setSunrise (String sunrise)
    {
        this.sunrise = sunrise;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getImg_id ()
    {
        return img_id;
    }

    public void setImg_id (String img_id)
    {
        this.img_id = img_id;
    }

    public Forecast[] getForecast ()
    {
        return forecast;
    }

    public void setForecast (Forecast[] forecast)
    {
        this.forecast = forecast;
    }

    public String getCity_name ()
    {
        return city_name;
    }

    public void setCity_name (String city_name)
    {
        this.city_name = city_name;
    }

    public String getCurrently ()
    {
        return currently;
    }

    public void setCurrently (String currently)
    {
        this.currently = currently;
    }

    public String getSunset ()
    {
        return sunset;
    }

    public void setSunset (String sunset)
    {
        this.sunset = sunset;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getCondition_slug ()
    {
        return condition_slug;
    }

    public void setCondition_slug (String condition_slug)
    {
        this.condition_slug = condition_slug;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getWind_speedy ()
    {
        return wind_speedy;
    }

    public void setWind_speedy (String wind_speedy)
    {
        this.wind_speedy = wind_speedy;
    }

    public String getCondition_code ()
    {
        return condition_code;
    }

    public void setCondition_code (String condition_code)
    {
        this.condition_code = condition_code;
    }

    public String getCid ()
    {
        return cid;
    }

    public void setCid (String cid)
    {
        this.cid = cid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", temp = "+temp+", sunrise = "+sunrise+", city = "+city+", description = "+description+", img_id = "+img_id+", forecast = "+forecast+", city_name = "+city_name+", currently = "+currently+", sunset = "+sunset+", humidity = "+humidity+", condition_slug = "+condition_slug+", time = "+time+", wind_speedy = "+wind_speedy+", condition_code = "+condition_code+", cid = "+cid+"]";
    }
}
			
