package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hx8 implements ifp0 {
    public static final hx8 a = new hx8();
    public static final u120 b = u120.c("performance");
    public static final u120 c = u120.c("crashlytics");
    public static final u120 d = u120.c("sessionSamplingRate");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        twq twqVar = (twq) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, twqVar.a);
        jfp0Var.a(c, twqVar.b);
        jfp0Var.b(d, twqVar.c);
    }
}
