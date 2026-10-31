package com.comscore.util.crashreport;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CrashReportHttpFlusher implements CrashReportFlusher {
    private static final int a = 4088;

    private HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("Connection", "Close");
        return httpURLConnection;
    }

    public URL createURL(String str) {
        if (str.length() > a) {
            String strSubstring = str.substring(0, a);
            int iLastIndexOf = strSubstring.lastIndexOf(37);
            if (iLastIndexOf >= 4086) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            str = strSubstring.concat("&ns_cut=");
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportFlusher
    public boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport) {
        boolean z = false;
        HttpURLConnection httpURLConnectionA = null;
        try {
            httpURLConnectionA = a(createURL(str + "?" + crashReportParser.reportToString(crashReport)));
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode == 200 || responseCode == 204) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpURLConnectionA != null) {
            httpURLConnectionA.disconnect();
        }
        return z;
    }
}
