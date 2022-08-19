package com.automacaoapi;

public class Weather
{
    private String valid_key;

    private String by;

    private Results results;

    private String from_cache;

    private String execution_time;

    public String getValid_key ()
    {
        return valid_key;
    }

    public void setValid_key (String valid_key)
    {
        this.valid_key = valid_key;
    }

    public String getBy ()
    {
        return by;
    }

    public void setBy (String by)
    {
        this.by = by;
    }

    public Results getResults ()
    {
        return results;
    }

    public void setResults (Results results)
    {
        this.results = results;
    }

    public String getFrom_cache ()
    {
        return from_cache;
    }

    public void setFrom_cache (String from_cache)
    {
        this.from_cache = from_cache;
    }

    public String getExecution_time ()
    {
        return execution_time;
    }

    public void setExecution_time (String execution_time)
    {
        this.execution_time = execution_time;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [valid_key = "+valid_key+", by = "+by+", results = "+results+", from_cache = "+from_cache+", execution_time = "+execution_time+"]";
    }
}
			
			