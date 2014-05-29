package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetTeamListResponse
{
    /***************************************************************************
     List of Teams
    ***************************************************************************/

    private static final String TEAM_TAG = "Team";
    private ArrayList<GetTeamResponse> ds_teams;

    public GetTeamListResponse()
    {
        ds_teams = new ArrayList<GetTeamResponse>();
    }

    public ArrayList<GetTeamResponse> get_teams()
    {
        return ds_teams;
    }

    public void set_teams(ArrayList<GetTeamResponse> ds_teams)
    {
        this.ds_teams = ds_teams;
    }

    public static GetTeamListResponse parse(SoapObject result)
    {
        GetTeamListResponse ds_res = new GetTeamListResponse();
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
                if (ds_info.getName().equals(TEAM_TAG))
                    ds_teams.add(GetTeamResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
