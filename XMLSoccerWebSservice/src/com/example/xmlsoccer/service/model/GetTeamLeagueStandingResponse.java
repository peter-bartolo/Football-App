package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetTeamLeagueStandingResponse
{

    /***************************************************************************
    <TeamLeagueStanding xmlns="http://xmlsoccer.com/LeagueStanding">
        <Team>Celtic</Team>
        <Team_Id>54</Team_Id>
        <Played>38</Played>
        <PlayedAtHome>19</PlayedAtHome>
        <PlayedAway>19</PlayedAway>
        <Won>31</Won>
        <Draw>6</Draw>
        <Lost>1</Lost>
        <NumberOfShots>840</NumberOfShots>
        <YellowCards>44</YellowCards>
        <RedCards>2</RedCards>
        <Goals_For>102</Goals_For>
        <Goals_Against>25</Goals_Against>
        <Goal_Difference>77</Goal_Difference>
        <Points>99</Points>
    </TeamLeagueStanding>
    ***************************************************************************/

    private static final String TEAM_TAG = "Team";
    private static final String TEAMID_TAG = "Team_Id";
    private static final String PLAYED_TAG = "Played";
    private static final String PLAYEDATHOME_TAG = "PlayedAtHome";
    private static final String PLAYEDAWAY_TAG = "PlayedAway";
    private static final String WON_TAG = "Won";
    private static final String DRAW_TAG = "Draw";
    private static final String LOST_TAG = "Lost";
    private static final String NUMBEROFSHOTS_TAG = "NumberOfShots";
    private static final String YELLOWCARDS_TAG = "YellowCards";
    private static final String REDCARDS_TAG = "RedCards";
    private static final String GOALSFOR_TAG = "Goals_For";
    private static final String GOALSAGAINST_TAG = "Goals_Against";
    private static final String GOALDIFF_TAG = "Goal_Difference";
    private static final String POINTS_TAG = "Points";

    private String str_team;
    private String str_team_id;
    private String str_played;
    private String str_playedathome;
    private String str_playedaway;
    private String str_won;
    private String str_draw;
    private String str_lost;
    private String str_numberofshots;
    private String str_yellowcards;
    private String str_redcards;
    private String str_goalsfor;
    private String str_goalsagainst;
    private String str_goaldiff;
    private String str_points;

    public String get_team()
    {
        return str_team;
    }

    public void set_team(String str_team)
    {
        this.str_team = str_team;
    }

    public String get_team_id()
    {
        return str_team_id;
    }

    public void set_team_id(String str_team_id)
    {
        this.str_team_id = str_team_id;
    }

    public String get_played()
    {
        return str_played;
    }

    public void set_played(String str_played)
    {
        this.str_played = str_played;
    }

    public String get_playedathome()
    {
        return str_playedathome;
    }

    public void set_playedathome(String str_playedathome)
    {
        this.str_playedathome = str_playedathome;
    }

    public String get_playedaway()
    {
        return str_playedaway;
    }

    public void set_playedaway(String str_playedaway)
    {
        this.str_playedaway = str_playedaway;
    }

    public String get_won()
    {
        return str_won;
    }

    public void set_won(String str_won)
    {
        this.str_won = str_won;
    }

    public String get_draw()
    {
        return str_draw;
    }

    public void set_draw(String str_draw)
    {
        this.str_draw = str_draw;
    }

    public String get_lost()
    {
        return str_lost;
    }

    public void set_lost(String str_lost)
    {
        this.str_lost = str_lost;
    }

    public String get_numberofshots()
    {
        return str_numberofshots;
    }

    public void set_numberofshots(String str_numberofshots)
    {
        this.str_numberofshots = str_numberofshots;
    }

    public String get_yellowcards()
    {
        return str_yellowcards;
    }

    public void set_yellowcards(String str_yellowcards)
    {
        this.str_yellowcards = str_yellowcards;
    }

    public String get_redcards()
    {
        return str_redcards;
    }

    public void set_redcards(String str_redcards)
    {
        this.str_redcards = str_redcards;
    }

    public String get_goalsfor()
    {
        return str_goalsfor;
    }

    public void set_goalsfor(String str_goalsfor)
    {
        this.str_goalsfor = str_goalsfor;
    }

    public String get_goalsagainst()
    {
        return str_goalsagainst;
    }

    public void set_goalsagainst(String str_goalsagainst)
    {
        this.str_goalsagainst = str_goalsagainst;
    }

    public String get_goaldiff()
    {
        return str_goaldiff;
    }

    public void set_goaldiff(String str_goaldiff)
    {
        this.str_goaldiff = str_goaldiff;
    }

    public String get_points()
    {
        return str_points;
    }

    public void set_points(String str_points)
    {
        this.str_points = str_points;
    }

    public static GetTeamLeagueStandingResponse parse(SoapObject result)
    {
        GetTeamLeagueStandingResponse ds_res = new GetTeamLeagueStandingResponse();
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
                if (ds_info.getName().equals(TEAM_TAG))
                    set_team(ds_info.getValue().toString());
                else if (ds_info.getName().equals(TEAMID_TAG))
                    set_team_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(PLAYED_TAG))
                    set_played(ds_info.getValue().toString());
                else if (ds_info.getName().equals(PLAYEDATHOME_TAG))
                    set_playedathome(ds_info.getValue().toString());
                else if (ds_info.getName().equals(PLAYEDAWAY_TAG))
                    set_playedaway(ds_info.getValue().toString());
                else if (ds_info.getName().equals(WON_TAG))
                    set_won(ds_info.getValue().toString());
                else if (ds_info.getName().equals(DRAW_TAG))
                    set_draw(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LOST_TAG))
                    set_lost(ds_info.getValue().toString());
                else if (ds_info.getName().equals(NUMBEROFSHOTS_TAG))
                    set_numberofshots(ds_info.getValue().toString());
                else if (ds_info.getName().equals(YELLOWCARDS_TAG))
                    set_yellowcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(REDCARDS_TAG))
                    set_redcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(GOALSFOR_TAG))
                    set_goalsfor(ds_info.getValue().toString());
                else if (ds_info.getName().equals(GOALSAGAINST_TAG))
                    set_goalsagainst(ds_info.getValue().toString());
                else if (ds_info.getName().equals(GOALDIFF_TAG))
                    set_goaldiff(ds_info.getValue().toString());
                else if (ds_info.getName().equals(POINTS_TAG))
                    set_points(ds_info.getValue().toString());
            }
            
        }
    }
}
