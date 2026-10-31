package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class gzp0 extends tv30 implements iu30 {
    public static final gzp0 a = new gzp0(1, d1u.class, "diagnosticReportEndpoint", "diagnosticReportEndpoint(Lcom/spotify/oopsplatform/diagnosticreports/DiagnosticReportType;)Ljava/lang/String;", 1);

    public final Object invoke(Object obj) {
        if (a1u.a[((n1u) obj).ordinal()] == 1) {
            return "https://diagnostic-reports.spotify.com/diagnostic-reports/v1/android-anr-profiles/uploads";
        }
        eg.o();
        return null;
    }
}
