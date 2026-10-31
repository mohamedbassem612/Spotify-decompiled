package com.comscore.util.crashreport;

import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class HttpGetCrashReportParser implements CrashReportParser {
    private final String a = " | ";
    private final String b = "ns_ap_uxc";

    private String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public String reportToString(CrashReport crashReport) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : crashReport.getExtras().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(b(str2));
            }
        }
        String message = crashReport.getMessage();
        if (crashReport.getStackTrace() != null) {
            message = message + " | " + crashReport.getStackTrace();
        }
        sb.append("&ns_ap_uxc=");
        sb.append(b(message));
        return (sb.length() <= 0 || sb.charAt(0) != '&') ? sb.toString() : sb.substring(1);
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public CrashReport stringToReport(String str) {
        String str2;
        HashMap map = new HashMap();
        for (String str3 : str.split("\\&", -1)) {
            int iIndexOf = str3.indexOf("=");
            map.put(str3.substring(0, iIndexOf), a(str3.substring(iIndexOf + 1, str3.length())));
        }
        String str4 = (String) map.get("ns_ap_uxc");
        map.remove("ns_ap_uxc");
        String str5 = "";
        if (str4 != null) {
            int iIndexOf2 = str4.indexOf(" | ");
            if (iIndexOf2 >= 0) {
                String strSubstring = str4.substring(0, iIndexOf2);
                String strSubstring2 = str4.substring(iIndexOf2 + 3, str4.length());
                str4 = strSubstring;
                str5 = strSubstring2;
            }
            String str6 = str4;
            str2 = str5;
            str5 = str6;
        } else {
            str2 = "";
        }
        return new CrashReport(str5, str2, map);
    }
}
