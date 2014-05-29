package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetTeamLeagueStandingListResponse
{
    /***************************************************************************
     List of Team League Standings
    ***************************************************************************/

    private static final String TEAMLEAGUESTANDING_TAG = "TeamLeagueStanding";
    private ArrayList<GetTeamLeagueStandingResponse> ds_teamleaguestandings;

    public GetTeamLeagueStandingListResponse()
    {
        ds_teamleaguestandings = new ArrayList<GetTeamLeagueStandingResponse>();
    }

    public ArrayList<GetTeamLeagueStandingResponse> get_teamleaguestandings()
    {
        return ds_teamleaguestandings;
    }

    public void set_teamleaguestandings(ArrayList<GetTeamLeagueStandingResponse> ds_teamleaguestandings)
    {
        this.ds_teamleaguestandings = ds_teamleaguestandings;
    }

    public static GetTeamLeagueStandingListResponse parse(SoapObject result)
    {
        GetTeamLeagueStandingListResponse ds_res = new GetTeamLeagueStandingListResponse();
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
                if (ds_info.getName().equals(TEAMLEAGUESTANDING_TAG))
                    ds_teamleaguestandings.add(GetTeamLeagueStandingResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
