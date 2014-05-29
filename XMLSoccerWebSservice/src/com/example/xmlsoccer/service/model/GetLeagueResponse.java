package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetLeagueResponse
{

    /***************************************************************************
    <League>
        <Id>3</Id>
        <Name>Scottish Premier League</Name>
        <Country>Scotland</Country>
        <Historical_Data>Yes</Historical_Data>
        <Fixtures>Yes</Fixtures>
        <Livescore>Yes</Livescore>
        <NumberOfMatches>3193</NumberOfMatches>
        <LatestMatch>2014-05-11T13:15:00-08:00</LatestMatch>
    </League>
    ***************************************************************************/

    private static final String ID_TAG = "Id";
    private static final String NAME_TAG = "Name";
    private static final String COUNTRY_TAG = "Country";
    private static final String HISTORICAL_DATA_TAG = "Historical_Data";
    private static final String FIXTURES_TAG = "Fixtures";
    private static final String LIVESCORE_TAG = "Livescore";
    private static final String NUMBEROFMATCHES_TAG = "NumberOfMatches";
    private static final String LATESTMATCH_TAG = "LatestMatch";

    private String str_id;
    private String str_name;
    private String str_country;
    private String str_historical_data;
    private String str_fixtures;
    private String str_livescore;
    private String str_numberofmatches;
    private String str_latestmatch;

    public String get_id()
    {
        return str_id;
    }

    public void set_id(String str_id)
    {
        this.str_id = str_id;
    }

    public String get_name()
    {
        return str_name;
    }

    public void set_name(String str_name)
    {
        this.str_name = str_name;
    }

    public String get_country()
    {
        return str_country;
    }

    public void set_country(String str_country)
    {
        this.str_country = str_country;
    }

    public String get_historical_data()
    {
        return str_historical_data;
    }

    public void set_historical_data(String str_historical_data)
    {
        this.str_historical_data = str_historical_data;
    }

    public String get_fixtures()
    {
        return str_fixtures;
    }

    public void set_fixtures(String str_fixtures)
    {
        this.str_fixtures = str_fixtures;
    }

    public String get_livescore()
    {
        return str_livescore;
    }

    public void set_livescore(String str_livescore)
    {
        this.str_livescore = str_livescore;
    }

    public String get_numberofmatches()
    {
        return str_numberofmatches;
    }

    public void set_numberofmatches(String str_numberofmatches)
    {
        this.str_numberofmatches = str_numberofmatches;
    }

    public String get_latestmatch()
    {
        return str_latestmatch;
    }

    public void set_latestmatch(String str_latestmatch)
    {
        this.str_latestmatch = str_latestmatch;
    }

    public static GetLeagueResponse parse(SoapObject result)
    {
        GetLeagueResponse ds_res = new GetLeagueResponse();
        ds_res.parseObject(result);
        return ds_res;
    }

    private void parseObject(SoapObject result)
    {
        for (int i = 0; i < result.getPropertyCount(); i++)
        {
            PropertyInfo ds_info = new PropertyInfo();
            result.getPropertyInfo(i, ds_info); 
            if (ds_info.getValue() instanceof SoapObject)
            {
                parseObject((SoapObject)ds_info.getValue());
            }
            else if (ds_info.getValue() instanceof SoapPrimitive)
            {
                if (ds_info.getName().equals(ID_TAG))
                    set_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(NAME_TAG))
                    set_name(ds_info.getValue().toString());
                else if (ds_info.getName().equals(COUNTRY_TAG))
                    set_country(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HISTORICAL_DATA_TAG))
                    set_historical_data(ds_info.getValue().toString());
                else if (ds_info.getName().equals(FIXTURES_TAG))
                    set_fixtures(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LIVESCORE_TAG))
                    set_livescore(ds_info.getValue().toString());
                else if (ds_info.getName().equals(NUMBEROFMATCHES_TAG))
                    set_numberofmatches(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LATESTMATCH_TAG))
                    set_latestmatch(ds_info.getValue().toString());
            }
        }
    }
}
