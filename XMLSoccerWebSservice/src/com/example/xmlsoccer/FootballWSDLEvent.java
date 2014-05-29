package com.example.xmlsoccer;

import android.util.Log;

import com.example.xmlsoccer.service.IWsdl2CodeEvents;

public class FootballWSDLEvent implements IWsdl2CodeEvents
{

    @Override
    public void Wsdl2CodeStartedRequest()
    {
        Log.i("XXXX", "Wsdl2CodeStartedRequest");
    }

    @Override
    public void Wsdl2CodeFinished(String methodName, Object Data)
    {
        Log.i("XXXX", "Wsdl2CodeFinished: Method name - " + methodName + " Data - " + Data.toString());
    }

    @Override
    public void Wsdl2CodeFinishedWithException(Exception ex)
    {
        Log.i("XXXX", "Wsdl2CodeFinishedWithException: Exception - " + ex.toString());
    }

    @Override
    public void Wsdl2CodeEndedRequest()
    {
        Log.i("XXXX", "Wsdl2CodeEndedRequest");
    }

}
