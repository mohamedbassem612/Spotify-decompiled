package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class es8 implements ifp0 {
    public static final es8 a = new es8();
    public static final u120 b = u120.c("sdkVersion");
    public static final u120 c = u120.c("gmpAppId");
    public static final u120 d = u120.c("platform");
    public static final u120 e = u120.c("installationUuid");
    public static final u120 f = u120.c("firebaseInstallationId");
    public static final u120 g = u120.c("firebaseAuthenticationToken");
    public static final u120 h = u120.c("appQualitySessionId");
    public static final u120 i = u120.c("buildVersion");
    public static final u120 j = u120.c("displayVersion");
    public static final u120 k = u120.c("session");
    public static final u120 l = u120.c("ndkPayload");
    public static final u120 m = u120.c("appExitInfo");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        vin vinVar = (vin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((uy8) vinVar).b);
        uy8 uy8Var = (uy8) vinVar;
        jfp0Var.a(c, uy8Var.c);
        jfp0Var.c(d, uy8Var.d);
        jfp0Var.a(e, uy8Var.e);
        jfp0Var.a(f, uy8Var.f);
        jfp0Var.a(g, uy8Var.g);
        jfp0Var.a(h, uy8Var.h);
        jfp0Var.a(i, uy8Var.i);
        jfp0Var.a(j, uy8Var.j);
        jfp0Var.a(k, uy8Var.k);
        jfp0Var.a(l, uy8Var.l);
        jfp0Var.a(m, uy8Var.m);
    }
}
