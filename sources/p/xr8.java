package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xr8 implements ifp0 {
    public static final xr8 a = new xr8();
    public static final u120 b = u120.c("requestTimeMs");
    public static final u120 c = u120.c("requestUptimeMs");
    public static final u120 d = u120.c("clientInfo");
    public static final u120 e = u120.c("logSource");
    public static final u120 f = u120.c("logSourceName");
    public static final u120 g = u120.c("logEvent");
    public static final u120 h = u120.c("qosTier");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        use0 use0Var = (use0) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.e(b, ((k19) use0Var).a);
        k19 k19Var = (k19) use0Var;
        jfp0Var.e(c, k19Var.b);
        jfp0Var.a(d, k19Var.c);
        jfp0Var.a(e, k19Var.d);
        jfp0Var.a(f, k19Var.e);
        jfp0Var.a(g, k19Var.f);
        jfp0Var.a(h, czy0.a);
    }
}
