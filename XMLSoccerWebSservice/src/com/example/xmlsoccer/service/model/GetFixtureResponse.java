package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetFixtureResponse
{
    /***************************************************************************
    <Match>
        <Id>287180</Id>
        <Date>2013-02-22T21:30:00+01:00</Date>
        <League>La Liga</League>
        <Round>25</Round>
        <HomeTeam>Ath Bilbao</HomeTeam>
        <HomeTeam_Id>143</HomeTeam_Id>
        <HomeGoals>1</HomeGoals>
        <AwayTeam>Sociedad</AwayTeam>
        <AwayTeam_Id>140</AwayTeam_Id>
        <AwayGoals>3</AwayGoals>
        <Time>Finished</Time>
        <Location>San Mam?s</Location>
        <BetAtHome>2,20</BetAtHome>
        <BetAtDraw>3,35</BetAtDraw>
        <BetAtAway>3,15</BetAtAway>
        <BetAtHomeLink>http://affiliates.bet-at-home.com/processing/clickthrgh.asp?btag=a_62598b_303</BetAtHomeLink>
        <InterwettenHome>2,10</InterwettenHome>
        <InterwettenDraw>3,30</InterwettenDraw>
        <InterwettenAway>3,30</InterwettenAway>
        <InterwettenLink>https://www.interwetten.com/en/sportsbook/e/9752883/</InterwettenLink>
        <HomeTeamYellowCardDetails>84': Iker Muniain;45': Ander Iturraspe;38': Aymeric Laporte;</HomeTeamYellowCardDetails>
        <AwayTeamYellowCardDetails>49': Asier Illarramendi;</AwayTeamYellowCardDetails>
        <HomeTeamRedCardDetails/>
        <AwayTeamRedCardDetails/>
    </Match>
    ***************************************************************************/

    private static final String ID_TAG = "Id";
    private static final String DATE_TAG = "Date";
    private static final String LEAGUE_TAG = "League";
    private static final String ROUND_TAG = "Round";
    private static final String HOMETEAM_TAG = "HomeTeam";
    private static final String HOMETEAM_ID_TAG = "HomeTeam_Id";
    private static final String HOMEGOALS_TAG = "HomeGoals";
    private static final String AWAYTEAM_TAG = "AwayTeam";
    private static final String AWAYTEAM_ID_TAG = "AwayTeam_Id";
    private static final String AWAYGOALS_TAG = "AwayGoals";
    private static final String TIME_TAG = "Time";
    private static final String LOCATION_TAG = "Location";
    private static final String BETATHOME_TAG = "BetAtHome";
    private static final String BETATDRAW_TAG = "BetAtDraw";
    private static final String BETATAWAY_TAG = "BetAtAway";
    private static final String BETATHOMELINK_TAG = "BetAtHomeLink";
    private static final String INTERWETTENHOME_TAG = "InterwettenHome";
    private static final String INTERWETTENDRAW_TAG = "InterwettenDraw";
    private static final String INTERWETTENAWAY_TAG = "InterwettenAway";
    private static final String INTERWETTENLINK_TAG = "InterwettenLink";
    private static final String HOMETEAMYELLOWCARDDETAILS_TAG = "HomeTeamYellowCardDetails";
    private static final String AWAYTEAMYELLOWCARDDETAILS_TAG = "AwayTeamYellowCardDetails";
    private static final String HOMETEAMREDCARDDETAILS_TAG = "HomeTeamRedCardDetails";
    private static final String AWAYTEAMREDCARDDETAILS_TAG = "AwayTeamRedCardDetails";

    private String str_id;
    private String str_date;
    private String str_league;
    private String str_round;
    private String str_hometeam;
    private String str_hometeam_id;
    private String str_homegoals;
    private String str_awayteam;
    private String str_awayteam_id;
    private String str_awaygoals;
    private String str_time;
    private String str_location;
    private String str_betathome;
    private String str_betatdraw;
    private String str_betataway;
    private String str_betathomelink;
    private String str_interwettenhome;
    private String str_interwettendraw;
    private String str_interwettenaway;
    private String str_interwettenlink;
    private String str_hometeamyellowcarddetails;
    private String str_awayteamyellowcarddetails;
    private String str_hometeamredcarddetails;
    private String str_awayteamredcarddetails;

    public String get_id()
    {
        return str_id;
    }

    public void set_id(String str_id)
    {
        this.str_id = str_id;
    }

    public String get_date()
    {
        return str_date;
    }

    public void set_date(String str_date)
    {
        this.str_date = str_date;
    }

    public String get_league()
    {
        return str_league;
    }

    public void set_league(String str_league)
    {
        this.str_league = str_league;
    }

    public String get_round()
    {
        return str_round;
    }

    public void set_round(String str_round)
    {
        this.str_round = str_round;
    }

    public String get_hometeam()
    {
        return str_hometeam;
    }

    public void set_hometeam(String str_hometeam)
    {
        this.str_hometeam = str_hometeam;
    }

    public String get_hometeam_id()
    {
        return str_hometeam_id;
    }

    public void set_hometeam_id(String str_hometeam_id)
    {
        this.str_hometeam_id = str_hometeam_id;
    }

    public String get_homegoals()
    {
        return str_homegoals;
    }

    public void set_homegoals(String str_homegoals)
    {
        this.str_homegoals = str_homegoals;
    }

    public String get_awayteam()
    {
        return str_awayteam;
    }

    public void set_awayteam(String str_awayteam)
    {
        this.str_awayteam = str_awayteam;
    }

    public String get_awayteam_id()
    {
        return str_awayteam_id;
    }

    public void set_awayteam_id(String str_awayteam_id)
    {
        this.str_awayteam_id = str_awayteam_id;
    }

    public String get_awaygoals()
    {
        return str_awaygoals;
    }

    public void set_awaygoals(String str_awaygoals)
    {
        this.str_awaygoals = str_awaygoals;
    }

    public String get_time()
    {
        return str_time;
    }

    public void set_time(String str_time)
    {
        this.str_time = str_time;
    }

    public String get_location()
    {
        return str_location;
    }

    public void set_location(String str_location)
    {
        this.str_location = str_location;
    }

    public String get_betathome()
    {
        return str_betathome;
    }

    public void set_betathome(String str_betathome)
    {
        this.str_betathome = str_betathome;
    }

    public String get_betatdraw()
    {
        return str_betatdraw;
    }

    public void set_betatdraw(String str_betatdraw)
    {
        this.str_betatdraw = str_betatdraw;
    }

    public String get_betataway()
    {
        return str_betataway;
    }

    public void set_betataway(String str_betataway)
    {
        this.str_betataway = str_betataway;
    }

    public String get_betathomelink()
    {
        return str_betathomelink;
    }

    public void set_betathomelink(String str_betathomelink)
    {
        this.str_betathomelink = str_betathomelink;
    }

    public String get_interwettenhome()
    {
        return str_interwettenhome;
    }

    public void set_interwettenhome(String str_interwettenhome)
    {
        this.str_interwettenhome = str_interwettenhome;
    }

    public String get_interwettendraw()
    {
        return str_interwettendraw;
    }

    public void set_interwettendraw(String str_interwettendraw)
    {
        this.str_interwettendraw = str_interwettendraw;
    }

    public String get_interwettenaway()
    {
        return str_interwettenaway;
    }

    public void set_interwettenaway(String str_interwettenaway)
    {
        this.str_interwettenaway = str_interwettenaway;
    }

    public String get_interwettenlink()
    {
        return str_interwettenlink;
    }

    public void set_interwettenlink(String str_interwettenlink)
    {
        this.str_interwettenlink = str_interwettenlink;
    }

    public String get_hometeamyellowcarddetails()
    {
        return str_hometeamyellowcarddetails;
    }

    public void set_hometeamyellowcarddetails(
            String str_hometeamyellowcarddetails)
    {
        this.str_hometeamyellowcarddetails = str_hometeamyellowcarddetails;
    }

    public String get_awayteamyellowcarddetails()
    {
        return str_awayteamyellowcarddetails;
    }

    public void set_awayteamyellowcarddetails(
            String str_awayteamyellowcarddetails)
    {
        this.str_awayteamyellowcarddetails = str_awayteamyellowcarddetails;
    }

    public String get_hometeamredcarddetails()
    {
        return str_hometeamredcarddetails;
    }

    public void set_hometeamredcarddetails(String str_hometeamredcarddetails)
    {
        this.str_hometeamredcarddetails = str_hometeamredcarddetails;
    }

    public String get_awayteamredcarddetails()
    {
        return str_awayteamredcarddetails;
    }

    public void set_awayteamredcarddetails(String str_awayteamredcarddetails)
    {
        this.str_awayteamredcarddetails = str_awayteamredcarddetails;
    }

    public static GetFixtureResponse parse(SoapObject result)
    {
        GetFixtureResponse ds_res = new GetFixtureResponse();
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
                else if (ds_info.getName().equals(DATE_TAG))
                    set_date(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LEAGUE_TAG))
                    set_league(ds_info.getValue().toString());
                else if (ds_info.getName().equals(ROUND_TAG))
                    set_round(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAM_TAG))
                    set_hometeam(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAM_ID_TAG))
                    set_hometeam_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEGOALS_TAG))
                    set_homegoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAM_TAG))
                    set_awayteam(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAM_ID_TAG))
                    set_awayteam_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYGOALS_TAG))
                    set_awaygoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(TIME_TAG))
                    set_time(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LOCATION_TAG))
                    set_location(ds_info.getValue().toString());
                else if (ds_info.getName().equals(BETATHOME_TAG))
                    set_betathome(ds_info.getValue().toString());
                else if (ds_info.getName().equals(BETATDRAW_TAG))
                    set_betatdraw(ds_info.getValue().toString());
                else if (ds_info.getName().equals(BETATAWAY_TAG))
                    set_betataway(ds_info.getValue().toString());
                else if (ds_info.getName().equals(BETATHOMELINK_TAG))
                    set_betathomelink(ds_info.getValue().toString());
                else if (ds_info.getName().equals(INTERWETTENHOME_TAG))
                    set_interwettenhome(ds_info.getValue().toString());
                else if (ds_info.getName().equals(INTERWETTENDRAW_TAG))
                    set_interwettendraw(ds_info.getValue().toString());
                else if (ds_info.getName().equals(INTERWETTENAWAY_TAG))
                    set_interwettenaway(ds_info.getValue().toString());
                else if (ds_info.getName().equals(INTERWETTENLINK_TAG))
                    set_interwettenlink(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAMYELLOWCARDDETAILS_TAG))
                    set_hometeamyellowcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAMYELLOWCARDDETAILS_TAG))
                    set_awayteamyellowcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAMREDCARDDETAILS_TAG))
                    set_hometeamredcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAMREDCARDDETAILS_TAG))
                    set_awayteamredcarddetails(ds_info.getValue().toString());
            }
        }
    }
}
