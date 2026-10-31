package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hs8 implements ifp0 {
    public static final hs8 a = new hs8();
    public static final u120 b = u120.c("identifier");
    public static final u120 c = u120.c("version");
    public static final u120 d = u120.c("displayVersion");
    public static final u120 e = u120.c("organization");
    public static final u120 f = u120.c("installationUuid");
    public static final u120 g = u120.c("developmentPlatform");
    public static final u120 h = u120.c("developmentPlatformVersion");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        cin cinVar = (cin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((hz8) cinVar).a);
        hz8 hz8Var = (hz8) cinVar;
        jfp0Var.a(c, hz8Var.b);
        jfp0Var.a(d, hz8Var.c);
        jfp0Var.a(e, null);
        jfp0Var.a(f, hz8Var.d);
        jfp0Var.a(g, hz8Var.e);
        jfp0Var.a(h, hz8Var.f);
    }
}
