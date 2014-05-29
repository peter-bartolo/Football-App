package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetTeamResponse
{

    /***************************************************************************
    <Team>
        <Id>54</Id>
        <Name>Celtic</Name>
        <Stadium>Celtic Park</Stadium>
        <Website>http://www.celticfc.net</Website>
        <WikiPageUrl>http://en.wikipedia.org/wiki/Celtic_F.C.</WikiPageUrl>
        <Country>Scotland</Country>
    </Team>

    or

    <Team>
        <Team_Id>54</Team_Id>
        <Name>Celtic</Name>
        <Country>Scotland</Country>
        <Stadium>Celtic Park</Stadium>
        <HomePageURL>http://www.celticfc.net</HomePageURL>
        <WIKILink>http://en.wikipedia.org/wiki/Celtic_F.C.</WIKILink>
    </Team>
    ***************************************************************************/

    private static final String ID_TAG = "Id";
    private static final String TEAMID_TAG = "Team_Id";
    private static final String NAME_TAG = "Name";
    private static final String STADIUM_TAG = "Stadium";
    private static final String WEBSITE_TAG = "Website";
    private static final String HOMEPAGEURL_TAG = "HomePageURL";
    private static final String WIKIPAGEURL_TAG = "WikiPageUrl";
    private static final String WIKILINK_TAG = "WIKILink";
    private static final String COUNTRY_TAG = "Country";

    private String str_id;
    private String str_name;
    private String str_stadium;
    private String str_website;
    private String str_wikipageurl;
    private String str_country;

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

    public String get_stadium()
    {
        return str_stadium;
    }

    public void set_stadium(String str_stadium)
    {
        this.str_stadium = str_stadium;
    }

    public String get_website()
    {
        return str_website;
    }

    public void set_website(String str_website)
    {
        this.str_website = str_website;
    }

    public String get_wikipageurl()
    {
        return str_wikipageurl;
    }

    public void set_wikipageurl(String str_wikipageurl)
    {
        this.str_wikipageurl = str_wikipageurl;
    }

    public String get_country()
    {
        return str_country;
    }

    public void set_country(String str_country)
    {
        this.str_country = str_country;
    }

    public static GetTeamResponse parse(SoapObject result)
    {
        GetTeamResponse ds_res = new GetTeamResponse();
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
                if (ds_info.getName().equals(ID_TAG) || ds_info.getName().equals(TEAMID_TAG))
                    set_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(NAME_TAG))
                    set_name(ds_info.getValue().toString());
                else if (ds_info.getName().equals(STADIUM_TAG))
                    set_stadium(ds_info.getValue().toString());
                else if (ds_info.getName().equals(WEBSITE_TAG) || ds_info.getName().equals(HOMEPAGEURL_TAG))
                    set_website(ds_info.getValue().toString());
                else if (ds_info.getName().equals(WIKIPAGEURL_TAG) || ds_info.getName().equals(WIKILINK_TAG))
                    set_wikipageurl(ds_info.getValue().toString());
                else if (ds_info.getName().equals(COUNTRY_TAG))
                    set_country(ds_info.getValue().toString());
            }
            
        }
    }
}
