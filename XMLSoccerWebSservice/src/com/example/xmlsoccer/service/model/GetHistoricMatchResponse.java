package com.example.xmlsoccer.service.model;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetHistoricMatchResponse
{
    /***************************************************************************
    <Match>
        <Id>29319</Id>
        <FixtureMatch_Id>285955</FixtureMatch_Id>
        <Date>2013-03-31T03:45:00-08:00</Date>
        <Round>32</Round>
        <Spectators>5977</Spectators>
        <League>Scottish Premier League</League>
        <HomeTeam>St Mirren</HomeTeam>
        <HomeTeam_Id>56</HomeTeam_Id>
        <HomeCorners>9</HomeCorners>
        <HomeGoals>1</HomeGoals>
        <HalfTimeHomeGoals>0</HalfTimeHomeGoals>
        <HomeShots>10</HomeShots>
        <HomeShotsOnTarget>3</HomeShotsOnTarget>
        <HomeFouls>4</HomeFouls>
        <HomeGoalDetails>81': penalty Paul McGowan;</HomeGoalDetails>
        <HomeLineupGoalkeeper>Craig Samson</HomeLineupGoalkeeper>
        <HomeLineupDefense>...</HomeLineupDefense>
        <HomeLineupMidfield>...</HomeLineupMidfield>
        <HomeLineupForward>Esmael Goncalves; Steven Thompson;</HomeLineupForward>
        <HomeYellowCards>1</HomeYellowCards>
        <HomeRedCards>0</HomeRedCards>
        <HomeTeamFormation>4-4-2</HomeTeamFormation>
        <AwayTeam>Celtic</AwayTeam>
        <AwayTeam_Id>54</AwayTeam_Id>
        <AwayCorners>4</AwayCorners>
        <AwayGoals>1</AwayGoals>
        <HalfTimeAwayGoals>1</HalfTimeAwayGoals>
        <AwayShots>5</AwayShots>
        <AwayShotsOnTarget>2</AwayShotsOnTarget>
        <AwayFouls>10</AwayFouls>
        <AwayGoalDetails>6': Kris Commons;</AwayGoalDetails>
        <AwayLineupGoalkeeper>Fraser Forster</AwayLineupGoalkeeper>
        <AwayLineupDefense>...</AwayLineupDefense>
        <AwayLineupMidfield>...</AwayLineupMidfield>
        <AwayLineupForward>Gary Hooper; Georgios Samaras;</AwayLineupForward>
        <AwayYellowCards>1</AwayYellowCards>
        <AwayRedCards>1</AwayRedCards>
        <AwayTeamFormation>4-4-2</AwayTeamFormation>
        <HomeTeamYellowCardDetails>46': Steven Thompson;</HomeTeamYellowCardDetails>
        <AwayTeamYellowCardDetails>67': Georgios Samaras;</AwayTeamYellowCardDetails>
        <HomeTeamRedCardDetails/>
        <AwayTeamRedCardDetails>55': Victor Wanyama;</AwayTeamRedCardDetails>
        <HomeSubDetails>...</HomeSubDetails>
        <AwaySubDetails>...</AwaySubDetails>
    </Match>
    ***************************************************************************/

    private static final String ID_TAG = "Id";
    private static final String FIXTURE_MATCH_ID_TAG = "FixtureMatch_Id";
    private static final String DATE_TAG = "Date";
    private static final String ROUND_TAG = "Round";
    private static final String SPECTATORS_TAG = "Spectators";
    private static final String LEAGUE_TAG = "League";
    private static final String HOMETEAM_TAG = "HomeTeam";
    private static final String HOMETEAM_ID_TAG = "HomeTeam_Id";
    private static final String HOMECORNERS_TAG = "HomeCorners";
    private static final String HOMEGOALS_TAG = "HomeGoals";
    private static final String HALFTIMEHOMEGOALS_TAG = "HalfTimeHomeGoals";
    private static final String HOMESHOTS_TAG = "HomeShots";
    private static final String HOMESHOTSONTARGET_TAG = "HomeShotsOnTarget";
    private static final String HOMEFOULS_TAG = "HomeFouls";
    private static final String HOMEGOALDETAILS_TAG = "HomeGoalDetails";
    private static final String HOMELINEUPGOALKEEPER_TAG = "HomeLineupGoalkeeper";
    private static final String HOMELINEUPDEFENSE_TAG = "HomeLineupDefense";
    private static final String HOMELINEUPMIDFIELD_TAG = "HomeLineupMidfield";
    private static final String HOMELINEUPFORWARD_TAG = "HomeLineupForward";
    private static final String HOMEYELLOWCARDS_TAG = "HomeYellowCards";
    private static final String HOMEREDCARDS_TAG = "HomeRedCards";
    private static final String HOMETEAMFORMATION_TAG = "HomeTeamFormation";
    private static final String AWAYTEAM_TAG = "AwayTeam";
    private static final String AWAYTEAM_ID_TAG = "AwayTeam_Id";
    private static final String AWAYCORNERS_TAG = "AwayCorners";
    private static final String AWAYGOALS_TAG = "AwayGoals";
    private static final String HALFTIMEAWAYGOALS_TAG = "HalfTimeAwayGoals";
    private static final String AWAYSHOTS_TAG = "AwayShots";
    private static final String AWAYSHOTSONTARGET_TAG = "AwayShotsOnTarget";
    private static final String AWAYFOULS_TAG = "AwayFouls";
    private static final String AWAYGOALDETAILS_TAG = "AwayGoalDetails";
    private static final String AWAYLINEUPGOALKEEPER_TAG = "AwayLineupGoalkeeper";
    private static final String AWAYLINEUPDEFENSE_TAG = "AwayLineupDefense";
    private static final String AWAYLINEUPMIDFIELD_TAG = "AwayLineupMidfield";
    private static final String AWAYLINEUPFORWARD_TAG = "AwayLineupForward";
    private static final String AWAYYELLOWCARDS_TAG = "AwayYellowCards";
    private static final String AWAYREDCARDS_TAG = "AwayRedCards";
    private static final String AWAYTEAMFORMATION_TAG = "AwayTeamFormation";
    private static final String HOMETEAMYELLOWCARDDETAILS_TAG = "HomeTeamYellowCardDetails";
    private static final String AWAYTEAMYELLOWCARDDETAILS_TAG = "AwayTeamYellowCardDetails";
    private static final String HOMETEAMREDCARDDETAILS_TAG = "HomeTeamRedCardDetails";
    private static final String AWAYTEAMREDCARDDETAILS_TAG = "AwayTeamRedCardDetails";
    private static final String HOMESUBDETAILS_TAG = "HomeSubDetails";
    private static final String AWAYSUBDETAILS_TAG = "AwaySubDetails";

    private String str_id;
    private String str_fixture_matchid;
    private String str_date;
    private String str_round;
    private String str_spectators;
    private String str_league;
    private String str_hometeam;
    private String str_hometeam_id;
    private String str_homecorners;
    private String str_homegoals;
    private String str_halftimehomegoals;
    private String str_homeshots;
    private String str_homeshotsontarget;
    private String str_homefouls;
    private String str_homegoaldetails;
    private String str_homelineupgoalkeeper;
    private String str_homelineupdefense;
    private String str_homelineupmidfield;
    private String str_homelineupforward;
    private String str_homeyellowcards;
    private String str_homeredcards;
    private String str_hometeamformation;
    private String str_awayteam;
    private String str_awayteam_id;
    private String str_awaycorners;
    private String str_awaygoals;
    private String str_halftimeawaygoals;
    private String str_awayshots;
    private String str_awayshotsontarget;
    private String str_awayfouls;
    private String str_awaygoaldetails;
    private String str_awaylineupgoalkeeper;
    private String str_awaylineupdefense;
    private String str_awaylineupmidfield;
    private String str_awaylineupforward;
    private String str_awayyellowcards;
    private String str_awayredcards;
    private String str_awayteamformation;
    private String str_hometeamyellowcarddetails;
    private String str_awayteamyellowcarddetails;
    private String str_hometeamredcarddetails;
    private String str_awayteamredcarddetails;
    private String str_homesubdetails;
    private String str_awaysubdetails;

    public String get_id()
    {
        return str_id;
    }

    public void set_id(String str_id)
    {
        this.str_id = str_id;
    }

    public String get_fixture_matchid()
    {
        return str_fixture_matchid;
    }

    public void set_fixture_matchid(String str_fixture_matchid)
    {
        this.str_fixture_matchid = str_fixture_matchid;
    }

    public String get_date()
    {
        return str_date;
    }

    public void set_date(String str_date)
    {
        this.str_date = str_date;
    }

    public String get_round()
    {
        return str_round;
    }

    public void set_round(String str_round)
    {
        this.str_round = str_round;
    }

    public String get_spectators()
    {
        return str_spectators;
    }

    public void set_spectators(String str_spectators)
    {
        this.str_spectators = str_spectators;
    }

    public String get_league()
    {
        return str_league;
    }

    public void set_league(String str_league)
    {
        this.str_league = str_league;
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

    public String get_homecorners()
    {
        return str_homecorners;
    }

    public void set_homecorners(String str_homecorners)
    {
        this.str_homecorners = str_homecorners;
    }

    public String get_homegoals()
    {
        return str_homegoals;
    }

    public void set_homegoals(String str_homegoals)
    {
        this.str_homegoals = str_homegoals;
    }

    public String get_halftimehomegoals()
    {
        return str_halftimehomegoals;
    }

    public void set_halftimehomegoals(String str_halftimehomegoals)
    {
        this.str_halftimehomegoals = str_halftimehomegoals;
    }

    public String get_homeshots()
    {
        return str_homeshots;
    }

    public void set_homeshots(String str_homeshots)
    {
        this.str_homeshots = str_homeshots;
    }

    public String get_homeshotsontarget()
    {
        return str_homeshotsontarget;
    }

    public void set_homeshotsontarget(String str_homeshotsontarget)
    {
        this.str_homeshotsontarget = str_homeshotsontarget;
    }

    public String get_homefouls()
    {
        return str_homefouls;
    }

    public void set_homefouls(String str_homefouls)
    {
        this.str_homefouls = str_homefouls;
    }

    public String get_homegoaldetails()
    {
        return str_homegoaldetails;
    }

    public void set_homegoaldetails(String str_homegoaldetails)
    {
        this.str_homegoaldetails = str_homegoaldetails;
    }

    public String get_homelineupgoalkeeper()
    {
        return str_homelineupgoalkeeper;
    }

    public void set_homelineupgoalkeeper(String str_homelineupgoalkeeper)
    {
        this.str_homelineupgoalkeeper = str_homelineupgoalkeeper;
    }

    public String get_homelineupdefense()
    {
        return str_homelineupdefense;
    }

    public void set_homelineupdefense(String str_homelineupdefense)
    {
        this.str_homelineupdefense = str_homelineupdefense;
    }

    public String get_homelineupmidfield()
    {
        return str_homelineupmidfield;
    }

    public void set_homelineupmidfield(String str_homelineupmidfield)
    {
        this.str_homelineupmidfield = str_homelineupmidfield;
    }

    public String get_homelineupforward()
    {
        return str_homelineupforward;
    }

    public void set_homelineupforward(String str_homelineupforward)
    {
        this.str_homelineupforward = str_homelineupforward;
    }

    public String get_homeyellowcards()
    {
        return str_homeyellowcards;
    }

    public void set_homeyellowcards(String str_homeyellowcards)
    {
        this.str_homeyellowcards = str_homeyellowcards;
    }

    public String get_homeredcards()
    {
        return str_homeredcards;
    }

    public void set_homeredcards(String str_homeredcards)
    {
        this.str_homeredcards = str_homeredcards;
    }

    public String get_hometeamformation()
    {
        return str_hometeamformation;
    }

    public void set_hometeamformation(String str_hometeamformation)
    {
        this.str_hometeamformation = str_hometeamformation;
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

    public String get_awaycorners()
    {
        return str_awaycorners;
    }

    public void set_awaycorners(String str_awaycorners)
    {
        this.str_awaycorners = str_awaycorners;
    }

    public String get_awaygoals()
    {
        return str_awaygoals;
    }

    public void set_awaygoals(String str_awaygoals)
    {
        this.str_awaygoals = str_awaygoals;
    }

    public String get_halftimeawaygoals()
    {
        return str_halftimeawaygoals;
    }

    public void set_halftimeawaygoals(String str_halftimeawaygoals)
    {
        this.str_halftimeawaygoals = str_halftimeawaygoals;
    }

    public String get_awayshots()
    {
        return str_awayshots;
    }

    public void set_awayshots(String str_awayshots)
    {
        this.str_awayshots = str_awayshots;
    }

    public String get_awayshotsontarget()
    {
        return str_awayshotsontarget;
    }

    public void set_awayshotsontarget(String str_awayshotsontarget)
    {
        this.str_awayshotsontarget = str_awayshotsontarget;
    }

    public String get_awayfouls()
    {
        return str_awayfouls;
    }

    public void set_awayfouls(String str_awayfouls)
    {
        this.str_awayfouls = str_awayfouls;
    }

    public String get_awaygoaldetails()
    {
        return str_awaygoaldetails;
    }

    public void set_awaygoaldetails(String str_awaygoaldetails)
    {
        this.str_awaygoaldetails = str_awaygoaldetails;
    }

    public String get_awaylineupgoalkeeper()
    {
        return str_awaylineupgoalkeeper;
    }

    public void set_awaylineupgoalkeeper(String str_awaylineupgoalkeeper)
    {
        this.str_awaylineupgoalkeeper = str_awaylineupgoalkeeper;
    }

    public String get_awaylineupdefense()
    {
        return str_awaylineupdefense;
    }

    public void set_awaylineupdefense(String str_awaylineupdefense)
    {
        this.str_awaylineupdefense = str_awaylineupdefense;
    }

    public String get_awaylineupmidfield()
    {
        return str_awaylineupmidfield;
    }

    public void set_awaylineupmidfield(String str_awaylineupmidfield)
    {
        this.str_awaylineupmidfield = str_awaylineupmidfield;
    }

    public String get_awaylineupforward()
    {
        return str_awaylineupforward;
    }

    public void set_awaylineupforward(String str_awaylineupforward)
    {
        this.str_awaylineupforward = str_awaylineupforward;
    }

    public String get_awayyellowcards()
    {
        return str_awayyellowcards;
    }

    public void set_awayyellowcards(String str_awayyellowcards)
    {
        this.str_awayyellowcards = str_awayyellowcards;
    }

    public String get_awayredcards()
    {
        return str_awayredcards;
    }

    public void set_awayredcards(String str_awayredcards)
    {
        this.str_awayredcards = str_awayredcards;
    }

    public String get_awayteamformation()
    {
        return str_awayteamformation;
    }

    public void set_awayteamformation(String str_awayteamformation)
    {
        this.str_awayteamformation = str_awayteamformation;
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

    public String get_homesubdetails()
    {
        return str_homesubdetails;
    }

    public void set_homesubdetails(String str_homesubdetails)
    {
        this.str_homesubdetails = str_homesubdetails;
    }

    public String get_awaysubdetails()
    {
        return str_awaysubdetails;
    }

    public void set_awaysubdetails(String str_awaysubdetails)
    {
        this.str_awaysubdetails = str_awaysubdetails;
    }

    public static GetHistoricMatchResponse parse(SoapObject result)
    {
        GetHistoricMatchResponse ds_res = new GetHistoricMatchResponse();
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
                else if (ds_info.getName().equals(FIXTURE_MATCH_ID_TAG))
                    set_fixture_matchid(ds_info.getValue().toString());
                else if (ds_info.getName().equals(DATE_TAG))
                    set_date(ds_info.getValue().toString());
                else if (ds_info.getName().equals(ROUND_TAG))
                    set_round(ds_info.getValue().toString());
                else if (ds_info.getName().equals(SPECTATORS_TAG))
                    set_spectators(ds_info.getValue().toString());
                else if (ds_info.getName().equals(LEAGUE_TAG))
                    set_league(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAM_TAG))
                    set_hometeam(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAM_ID_TAG))
                    set_hometeam_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMECORNERS_TAG))
                    set_homecorners(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEGOALS_TAG))
                    set_homegoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HALFTIMEHOMEGOALS_TAG))
                    set_halftimehomegoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMESHOTS_TAG))
                    set_homeshots(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMESHOTSONTARGET_TAG))
                    set_homeshotsontarget(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEFOULS_TAG))
                    set_homefouls(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEGOALDETAILS_TAG))
                    set_homegoaldetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMELINEUPGOALKEEPER_TAG))
                    set_homelineupgoalkeeper(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMELINEUPDEFENSE_TAG))
                    set_homelineupdefense(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMELINEUPMIDFIELD_TAG))
                    set_homelineupmidfield(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMELINEUPFORWARD_TAG))
                    set_homelineupforward(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEYELLOWCARDS_TAG))
                    set_homeyellowcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMEREDCARDS_TAG))
                    set_homeredcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAMFORMATION_TAG))
                    set_hometeamformation(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAM_TAG))
                    set_awayteam(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAM_ID_TAG))
                    set_awayteam_id(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYCORNERS_TAG))
                    set_awaycorners(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYGOALS_TAG))
                    set_awaygoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HALFTIMEAWAYGOALS_TAG))
                    set_halftimeawaygoals(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYSHOTS_TAG))
                    set_awayshots(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYSHOTSONTARGET_TAG))
                    set_awayshotsontarget(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYFOULS_TAG))
                    set_awayfouls(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYGOALDETAILS_TAG))
                    set_awaygoaldetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYLINEUPGOALKEEPER_TAG))
                    set_awaylineupgoalkeeper(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYLINEUPDEFENSE_TAG))
                    set_awaylineupdefense(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYLINEUPMIDFIELD_TAG))
                    set_awaylineupmidfield(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYLINEUPFORWARD_TAG))
                    set_awaylineupforward(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYYELLOWCARDS_TAG))
                    set_awayyellowcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYREDCARDS_TAG))
                    set_awayredcards(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAMFORMATION_TAG))
                    set_awayteamformation(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAMYELLOWCARDDETAILS_TAG))
                    set_hometeamyellowcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAMYELLOWCARDDETAILS_TAG))
                    set_awayteamyellowcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMETEAMREDCARDDETAILS_TAG))
                    set_hometeamredcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYTEAMREDCARDDETAILS_TAG))
                    set_awayteamredcarddetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(HOMESUBDETAILS_TAG))
                    set_homesubdetails(ds_info.getValue().toString());
                else if (ds_info.getName().equals(AWAYSUBDETAILS_TAG))
                    set_awaysubdetails(ds_info.getValue().toString());
            }
        }
    }
}
