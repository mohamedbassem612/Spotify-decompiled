package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wr8 implements ifp0 {
    public static final wr8 a = new wr8();
    public static final u120 b = u120.c("eventTimeMs");
    public static final u120 c = u120.c("eventCode");
    public static final u120 d = u120.c("complianceData");
    public static final u120 e = u120.c("eventUptimeMs");
    public static final u120 f = u120.c("sourceExtension");
    public static final u120 g = u120.c("sourceExtensionJsonProto3");
    public static final u120 h = u120.c("timezoneOffsetSeconds");
    public static final u120 i = u120.c("networkConnectionInfo");
    public static final u120 j = u120.c("experimentIds");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        bse0 bse0Var = (bse0) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.e(b, ((j19) bse0Var).a);
        j19 j19Var = (j19) bse0Var;
        jfp0Var.a(c, j19Var.b);
        jfp0Var.a(d, j19Var.c);
        jfp0Var.e(e, j19Var.d);
        jfp0Var.a(f, j19Var.e);
        jfp0Var.a(g, j19Var.f);
        jfp0Var.e(h, j19Var.g);
        jfp0Var.a(i, j19Var.h);
        jfp0Var.a(j, j19Var.i);
    }
}
