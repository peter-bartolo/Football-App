package com.example.xmlsoccer.service.model;

import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GetTopScorerByLeagueAndSeasonResponse
{
    /***************************************************************************
     List of top scorers
    ***************************************************************************/

    private static final String TOPSCORER_TAG = "Topscorer";
    private ArrayList<TopScorer> ds_topscorers;

    public GetTopScorerByLeagueAndSeasonResponse()
    {
        ds_topscorers = new ArrayList<TopScorer>();
    }

    public ArrayList<TopScorer> get_topscorers()
    {
        return ds_topscorers;
    }

    public void set_matches(ArrayList<TopScorer> ds_topscorers)
    {
        this.ds_topscorers = ds_topscorers;
    }

    public static GetTopScorerByLeagueAndSeasonResponse parse(SoapObject result)
    {
        GetTopScorerByLeagueAndSeasonResponse ds_res = new GetTopScorerByLeagueAndSeasonResponse();
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
                if (ds_info.getName().equals(TOPSCORER_TAG))
                    ds_topscorers.add(TopScorer.parse((SoapObject)ds_info.getValue()));
                else
                    parseObject((SoapObject)ds_info.getValue());
            }
        }
    }

    public static class TopScorer
    {

        /***********************************************************************
        <Topscorer>
            <Rank>1</Rank>
            <Name>Kris Commons</Name>
            <TeamName>Celtic</TeamName>
            <Team_Id>54</Team_Id>
            <Nationality>Scotland</Nationality>
            <Goals>27</Goals>
            <FirstScorer>11</FirstScorer>
            <Penalties>5</Penalties>
            <MissedPenalties>0</MissedPenalties>
        </Topscorer>
        ***********************************************************************/

        private static final String RANK_TAG = "Rank";
        private static final String NAME_TAG = "Name";
        private static final String TEAMNAME_TAG = "TeamName";
        private static final String TEAM_ID_TAG = "Team_Id";
        private static final String NATIONALITY_TAG = "Nationality";
        private static final String GOALS_TAG = "Goals";
        private static final String FIRSTSCORER_TAG = "FirstScorer";
        private static final String PENALTIES_TAG = "Penalties";
        private static final String MISSEDPENALTIES_TAG = "MissedPenalties";

        private String str_rank;
        private String str_name;
        private String str_teamname;
        private String str_team_id;
        private String str_nationality;
        private String str_goals;
        private String str_firstscorer;
        private String str_penalties;
        private String str_missedpenalties;

        public String get_rank()
        {
            return str_rank;
        }

        public void set_rank(String str_rank)
        {
            this.str_rank = str_rank;
        }

        public String get_name()
        {
            return str_name;
        }

        public void set_name(String str_name)
        {
            this.str_name = str_name;
        }

        public String get_teamname()
        {
            return str_teamname;
        }

        public void set_teamname(String str_teamname)
        {
            this.str_teamname = str_teamname;
        }

        public String get_team_id()
        {
            return str_team_id;
        }

        public void set_team_id(String str_team_id)
        {
            this.str_team_id = str_team_id;
        }

        public String get_nationality()
        {
            return str_nationality;
        }

        public void set_nationality(String str_nationality)
        {
            this.str_nationality = str_nationality;
        }

        public String get_goals()
        {
            return str_goals;
        }

        public void set_goals(String str_goals)
        {
            this.str_goals = str_goals;
        }

        public String get_firstscorer()
        {
            return str_firstscorer;
        }

        public void set_firstscorer(String str_firstscorer)
        {
            this.str_firstscorer = str_firstscorer;
        }

        public String get_penalties()
        {
            return str_penalties;
        }

        public void set_penalties(String str_penalties)
        {
            this.str_penalties = str_penalties;
        }

        public String get_missedpenalties()
        {
            return str_missedpenalties;
        }

        public void set_missedpenalties(String str_missedpenalties)
        {
            this.str_missedpenalties = str_missedpenalties;
        }

        public static TopScorer parse(SoapObject value)
        {
            TopScorer ds_res = new TopScorer();
            ds_res.parseObject(value);
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
                    if (ds_info.getName().equals(RANK_TAG))
                        set_rank(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(NAME_TAG))
                        set_name(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(TEAMNAME_TAG))
                        set_teamname(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(TEAM_ID_TAG))
                        set_team_id(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(NATIONALITY_TAG))
                        set_nationality(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(GOALS_TAG))
                        set_goals(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(FIRSTSCORER_TAG))
                        set_firstscorer(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(PENALTIES_TAG))
                        set_penalties(ds_info.getValue().toString());
                    else if (ds_info.getName().equals(MISSEDPENALTIES_TAG))
                        set_missedpenalties(ds_info.getValue().toString());
                }
            }
        }
    }
}
