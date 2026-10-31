package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ns8 implements ifp0 {
    public static final ns8 a = new ns8();
    public static final u120 b = u120.c("threads");
    public static final u120 c = u120.c("exception");
    public static final u120 d = u120.c("appExitInfo");
    public static final u120 e = u120.c("signal");
    public static final u120 f = u120.c("binaries");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        jin jinVar = (jin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((pz8) jinVar).a);
        pz8 pz8Var = (pz8) jinVar;
        jfp0Var.a(c, pz8Var.b);
        jfp0Var.a(d, pz8Var.c);
        jfp0Var.a(e, pz8Var.d);
        jfp0Var.a(f, pz8Var.e);
    }
}
