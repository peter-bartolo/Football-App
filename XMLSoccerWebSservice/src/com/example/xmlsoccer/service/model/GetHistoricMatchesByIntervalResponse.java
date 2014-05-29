package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetHistoricMatchesByIntervalResponse
{
    /***************************************************************************
     List of Historic Matches
    ***************************************************************************/

    private static final String MATCH_TAG = "Match";
    private ArrayList<GetHistoricMatchResponse> ds_matches;

    public GetHistoricMatchesByIntervalResponse()
    {
        ds_matches = new ArrayList<GetHistoricMatchResponse>();
    }

    public ArrayList<GetHistoricMatchResponse> get_matches()
    {
        return ds_matches;
    }

    public void set_matches(ArrayList<GetHistoricMatchResponse> ds_matches)
    {
        this.ds_matches = ds_matches;
    }

    public static GetHistoricMatchesByIntervalResponse parse(SoapObject result)
    {
        GetHistoricMatchesByIntervalResponse ds_res = new GetHistoricMatchesByIntervalResponse();
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
                    ds_matches.add(GetHistoricMatchResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
