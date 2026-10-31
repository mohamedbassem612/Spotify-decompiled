package com.comscore.util.crashreport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface CrashReportFlusher {
    boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport);
}
