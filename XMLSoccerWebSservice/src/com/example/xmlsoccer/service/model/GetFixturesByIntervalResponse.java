package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class GetFixturesByIntervalResponse
{
    /***************************************************************************
     List of Fixtures
    ***************************************************************************/

    private static final String MATCH_TAG = "Match";
    private ArrayList<GetFixtureResponse> ds_fixtures;

    public GetFixturesByIntervalResponse()
    {
        ds_fixtures = new ArrayList<GetFixtureResponse>();
    }

    public ArrayList<GetFixtureResponse> get_fixtures()
    {
        return ds_fixtures;
    }

    public void set_fixtures(ArrayList<GetFixtureResponse> ds_fixtures)
    {
        this.ds_fixtures = ds_fixtures;
    }

    public static GetFixturesByIntervalResponse parse(SoapObject result)
    {
        GetFixturesByIntervalResponse ds_res = new GetFixturesByIntervalResponse();
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
                    ds_fixtures.add(GetFixtureResponse.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }
}
