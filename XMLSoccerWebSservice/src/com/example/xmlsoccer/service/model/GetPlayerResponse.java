package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetPlayerResponse
{

    /***************************************************************************
    <Player>
        <Id>2963</Id>
        <Name>Fraser Forster</Name>
        <Height>2.01</Height>
        <Weight>73.92</Weight>
        <Nationality>England</Nationality>
        <Position>Goalkeeper</Position>
        <Team_Id>54</Team_Id>
        <PlayerNumber>1</PlayerNumber>
        <DateOfBirth>1988-03-17T00:00:00-08:00</DateOfBirth>
        <DateOfSigning>2012-07-05T00:00:00-08:00</DateOfSigning>
        <Signing>&pound;2,500,000</Signing>
    </Player>
    ***************************************************************************/

    private static final String ID_TAG = "Id";
    private static final String NAME_TAG = "Name";
    private static final String HEIGHT_TAG = "Height";
    private static final String WEIGHT_TAG = "Weight";
    private static final String NATIONALITY_TAG = "Nationality";
    private static final String POSITION_TAG = "Position";
    private static final String TEAMID_TAG = "Team_Id";
    private static final String PLAYERNUMBER_TAG = "PlayerNumber";
    private static final String DATEOFBIRTH_TAG = "DateOfBirth";
    private static final String DATEOFSIGNING_TAG = "DateOfSigning";
    private static final String SIGNING_TAG = "Signing";

    private String str_id;
    private String str_name;
    private String str_height;
    private String str_weight;
    private String str_nationality;
    private String str_position;
    private String str_teamid;
    private String str_playernumber;
    private String str_dateofbirth;
    private String str_dateofsigning;
    private String str_signing;
    
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

    public String get_height()
    {
        return str_height;
    }

    public void set_height(String str_height)
    {
        this.str_height = str_height;
    }

    public String get_weight()
    {
        return str_weight;
    }

    public void set_weight(String str_weight)
    {
        this.str_weight = str_weight;
    }

    public String get_nationality()
    {
        return str_nationality;
    }

    public void set_nationality(String str_nationality)
    {
        this.str_nationality = str_nationality;
    }

    public String get_position()
    {
        return str_position;
    }

    public void set_position(String str_position)
    {
        this.str_position = str_position;
    }

    public String get_teamid()
    {
        return str_teamid;
    }

    public void set_teamid(String str_teamid)
    {
        this.str_teamid = str_teamid;
    }

    public String get_playernumber()
    {
        return str_playernumber;
    }

    public void set_playernumber(String str_playernumber)
    {
        this.str_playernumber = str_playernumber;
    }

    public String get_dateofbirth()
    {
        return str_dateofbirth;
    }

    public void set_dateofbirth(String str_dateofbirth)
    {
        this.str_dateofbirth = str_dateofbirth;
    }

    public String get_dateofsigning()
    {
        return str_dateofsigning;
    }

    public void set_dateofsigning(String str_dateofsigning)
    {
        this.str_dateofsigning = str_dateofsigning;
    }

    public String get_signing()
    {
        return str_signing;
    }

    public void set_signing(String str_signing)
    {
        this.str_signing = str_signing;
    }

    public static GetPlayerResponse parse(SoapObject result)
    {
        GetPlayerResponse ds_res = new GetPlayerResponse();
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
                else if (ds_info.getName().equals(HEIGHT_TAG))
                    set_height(ds_info.getValue().toString());
                else if (ds_info.getName().equals(WEIGHT_TAG))
                    set_weight(ds_info.getValue().toString());
                else if (ds_info.getName().equals(NATIONALITY_TAG))
                    set_nationality(ds_info.getValue().toString());
                else if (ds_info.getName().equals(POSITION_TAG))
                    set_position(ds_info.getValue().toString());
                else if (ds_info.getName().equals(TEAMID_TAG))
                    set_teamid(ds_info.getValue().toString());
                else if (ds_info.getName().equals(PLAYERNUMBER_TAG))
                    set_playernumber(ds_info.getValue().toString());
                else if (ds_info.getName().equals(DATEOFBIRTH_TAG))
                    set_dateofbirth(ds_info.getValue().toString());
                else if (ds_info.getName().equals(DATEOFSIGNING_TAG))
                    set_dateofsigning(ds_info.getValue().toString());
                else if (ds_info.getName().equals(SIGNING_TAG))
                    set_signing(ds_info.getValue().toString());
            }
            
        }
    }
}
