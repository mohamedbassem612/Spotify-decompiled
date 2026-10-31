package com.comscore.util.crashreport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CrashReportDecorator$a {
    String a;
    boolean b;
    int c;
    int d;
    int e;
    final /* synthetic */ CrashReportDecorator f;

    public CrashReportDecorator$a(CrashReportDecorator crashReportDecorator, String str) {
        this.f = crashReportDecorator;
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(32);
        if (iIndexOf < 0) {
            this.b = false;
            return;
        }
        String strSubstring = strTrim.substring(0, iIndexOf);
        this.a = strSubstring;
        String strReplace = strSubstring.replace(" ", "");
        this.a = strReplace;
        if (strReplace.length() == 0) {
            this.b = false;
            return;
        }
        String strTrim2 = strTrim.substring(iIndexOf + 1, strTrim.length()).trim();
        int iIndexOf2 = strTrim2.indexOf(32);
        if (iIndexOf2 < 0) {
            this.b = false;
            return;
        }
        String strSubstring2 = strTrim2.substring(0, iIndexOf2);
        if (strSubstring2.length() != 2) {
            this.b = false;
            return;
        }
        String strSubstring3 = strSubstring2.substring(0, 1);
        String strSubstring4 = strSubstring2.substring(1, 2);
        this.c = Integer.valueOf(strSubstring3).intValue();
        this.d = Integer.valueOf(strSubstring4).intValue();
        String strTrim3 = strTrim2.substring(2, strTrim2.length()).trim();
        int iIndexOf3 = strTrim3.indexOf(32);
        if (iIndexOf3 < 0) {
            return;
        }
        this.b = "true".equals(strTrim3.substring(0, iIndexOf3));
        this.e = Integer.valueOf(strTrim3.substring(iIndexOf3 + 1, strTrim3.length()).trim()).intValue();
    }

    public CrashReportDecorator$a(CrashReportDecorator crashReportDecorator) {
        this.f = crashReportDecorator;
    }
}
