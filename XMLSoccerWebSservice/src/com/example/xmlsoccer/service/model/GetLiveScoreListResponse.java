package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetLiveScoreListResponse
{
    /***************************************************************************
     List of Live Matches
    ***************************************************************************/

    private static final String MATCH_TAG = "Match";
    private ArrayList<GetLiveScoreResponse> ds_matches;

    public GetLiveScoreListResponse()
    {
        ds_matches = new ArrayList<GetLiveScoreResponse>();
    }

    public ArrayList<GetLiveScoreResponse> get_matches()
    {
        return ds_matches;
    }

    public void set_matches(ArrayList<GetLiveScoreResponse> ds_matches)
    {
        this.ds_matches = ds_matches;
    }

    public static GetLiveScoreListResponse parse(SoapObject result)
    {
        GetLiveScoreListResponse ds_res = new GetLiveScoreListResponse();
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
                if (ds_info.getName().equals(MATCH_TAG))
                    ds_matches.add(GetLiveScoreResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
