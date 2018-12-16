package com.example.restdemocall.Model;

public class Result {
    private String largest_city;

    private String id;

    private String area;

    private String name;

    private String abbr;

    private String capital;

    private String country;

    public String getLargest_city ()
    {
        return largest_city;
    }

    public void setLargest_city (String largest_city)
    {
        this.largest_city = largest_city;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getArea ()
    {
        return area;
    }

    public void setArea (String area)
    {
        this.area = area;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAbbr ()
    {
        return abbr;
    }

    public void setAbbr (String abbr)
    {
        this.abbr = abbr;
    }

    public String getCapital ()
    {
        return capital;
    }

    public void setCapital (String capital)
    {
        this.capital = capital;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [largest_city = "+largest_city+", id = "+id+", area = "+area+", name = "+name+", abbr = "+abbr+", capital = "+capital+", country = "+country+"]";
    }
}
