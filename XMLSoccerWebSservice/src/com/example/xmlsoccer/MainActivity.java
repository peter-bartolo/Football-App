package com.example.xmlsoccer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.xmlsoccer.service.FootballDataDemo;

public class MainActivity extends Activity implements OnClickListener
{

    private static final String API_KEY = "QNAHZYRUNHTEAYGHXQPRHTBEIYYJGANWYLBXBJGFURQWTILVWV";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_activate).setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0)
    {
        FootballDataDemo ds_demo = new FootballDataDemo(new FootballWSDLEvent());
        try
        {
//            ds_demo.CheckApiKeyAsync(API_KEY);
//            ds_demo.GetTeamAsync(API_KEY, "Celtic");
//            ds_demo.GetHistoricMatchesByIDAsync(API_KEY, 29319);
//            ds_demo.GetTopScorersByLeagueAndSeasonAsync(API_KEY, 
//                "Scottish Premier League", "1314");
//            ds_demo.GetHistoricMatchesByFixtureMatchIDAsync(API_KEY, 285955);
//            ds_demo.GetHistoricMatchesByTeamAndDateIntervalAsync(API_KEY, 
//                "54", "2012-04-03", "2013-04-03");
//            ds_demo.GetHistoricMatchesByLeagueAndDateIntervalAsync(API_KEY, 
//                "Scottish Premier League", "2013-04-03", "2013-05-03");
//            ds_demo.GetHistoricMatchesByLeagueAndSeasonAsync(API_KEY, 
//                "Scottish Premier League", "1314");
//            ds_demo.GetHistoricMatchesByTeamsAndDateIntervalAsync(API_KEY, "49", 
//                "54", "2012-01-03", "2014-05-03");
//            ds_demo.GetFixturesByDateIntervalAsync(API_KEY, "2013-04-03", 
//                "2013-07-03");
//            ds_demo.GetFixturesByDateIntervalAndLeagueAsync(
//                "Scottish Premier League", API_KEY, "2013-10-01", "2014-05-10");
//            ds_demo.GetFixturesByDateIntervalAndTeamAsync(API_KEY, "2013-10-01", 
//                "2014-05-10", "54");
//            ds_demo.GetAllTeamsAsync(API_KEY);
//            ds_demo.GetAllLeaguesAsync(API_KEY);
//            ds_demo.GetFixturesByLeagueAndSeasonAsync(API_KEY, "1314", 
//                "Scottish Premier League");
//            ds_demo.GetLeagueStandingsBySeasonAsync(API_KEY, 
//                "Scottish Premier League", "1314");
//            ds_demo.GetAllTeamsByLeagueAndSeasonAsync(API_KEY, 
//                "Scottish Premier League", "1314");
//            ds_demo.GetEarliestMatchDatePerLeagueAsync(API_KEY, 
//                "Scottish Premier League");
//            ds_demo.GetLiveScoreAsync(API_KEY); 
//            ds_demo.GetLiveScoreByLeague(API_KEY, "Scottish Premier League");
            ds_demo.GetPlayersByTeamAsync(API_KEY, "54");
            ds_demo.GetPlayerByIdAsync(API_KEY, 2963);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
