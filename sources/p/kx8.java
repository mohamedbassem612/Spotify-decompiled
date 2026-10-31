package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kx8 implements ifp0 {
    public static final kx8 a = new kx8();
    public static final u120 b = u120.c("sessionId");
    public static final u120 c = u120.c("firstSessionId");
    public static final u120 d = u120.c("sessionIndex");
    public static final u120 e = u120.c("eventTimestampUs");
    public static final u120 f = u120.c("dataCollectionStatus");
    public static final u120 g = u120.c("firebaseInstallationId");
    public static final u120 h = u120.c("firebaseAuthenticationToken");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        qf61 qf61Var = (qf61) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, qf61Var.a);
        jfp0Var.a(c, qf61Var.b);
        jfp0Var.c(d, qf61Var.c);
        jfp0Var.e(e, qf61Var.d);
        jfp0Var.a(f, qf61Var.e);
        jfp0Var.a(g, qf61Var.f);
        jfp0Var.a(h, qf61Var.g);
    }
}
