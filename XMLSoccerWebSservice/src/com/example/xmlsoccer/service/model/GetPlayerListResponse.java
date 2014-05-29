package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetPlayerListResponse
{
    /***************************************************************************
     List of Teams
    ***************************************************************************/

    private static final String PLAYER_TAG = "Player";
    private ArrayList<GetPlayerResponse> ds_players;

    public GetPlayerListResponse()
    {
        ds_players = new ArrayList<GetPlayerResponse>();
    }

    public ArrayList<GetPlayerResponse> get_players()
    {
        return ds_players;
    }

    public void set_players(ArrayList<GetPlayerResponse> ds_players)
    {
        this.ds_players = ds_players;
    }

    public static GetPlayerListResponse parse(SoapObject result)
    {
        GetPlayerListResponse ds_res = new GetPlayerListResponse();
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
                if (ds_info.getName().equals(PLAYER_TAG))
                    ds_players.add(GetPlayerResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
