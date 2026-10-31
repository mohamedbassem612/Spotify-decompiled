package com.comscore.util.crashreport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface CrashReportParser {
    String reportToString(CrashReport crashReport);

    CrashReport stringToReport(String str);
}
