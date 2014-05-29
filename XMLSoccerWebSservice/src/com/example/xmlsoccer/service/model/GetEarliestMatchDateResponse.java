package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetEarliestMatchDateResponse
{
    /***************************************************************************
    <LeagueInformation>
        <Date>2000-07-28T14:00:00-08:00</Date>
    </LeagueInformation>
    ***************************************************************************/

    private static final String DATE_TAG = "Date";

    private String str_date;

    public String get_date()
    {
        return str_date;
    }

    public void set_date(String str_date)
    {
        this.str_date = str_date;
    }

    public static GetEarliestMatchDateResponse parse(SoapObject result)
    {
        GetEarliestMatchDateResponse ds_res = new GetEarliestMatchDateResponse();
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
                if (ds_info.getName().equals(DATE_TAG))
                    set_date(ds_info.getValue().toString());
            }
        }
    }
}
