package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetLeagueListResponse
{
    /***************************************************************************
     List of Leagues
    ***************************************************************************/

    private static final String LEAGUE_TAG = "League";
    private ArrayList<GetLeagueResponse> ds_leagues;

    public GetLeagueListResponse()
    {
        ds_leagues = new ArrayList<GetLeagueResponse>();
    }

    public ArrayList<GetLeagueResponse> get_leagues()
    {
        return ds_leagues;
    }

    public void set_leagues(ArrayList<GetLeagueResponse> ds_leagues)
    {
        this.ds_leagues = ds_leagues;
    }

    public static GetLeagueListResponse parse(SoapObject result)
    {
        GetLeagueListResponse ds_res = new GetLeagueListResponse();
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
                if (ds_info.getName().equals(LEAGUE_TAG))
                    ds_leagues.add(GetLeagueResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
