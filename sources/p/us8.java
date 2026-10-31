package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class us8 implements ifp0 {
    public static final us8 a = new us8();
    public static final u120 b = u120.c("timestamp");
    public static final u120 c = u120.c("type");
    public static final u120 d = u120.c("app");
    public static final u120 e = u120.c("device");
    public static final u120 f = u120.c("log");
    public static final u120 g = u120.c("rollouts");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        rin rinVar = (rin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.e(b, ((mz8) rinVar).a);
        mz8 mz8Var = (mz8) rinVar;
        jfp0Var.a(c, mz8Var.b);
        jfp0Var.a(d, mz8Var.c);
        jfp0Var.a(e, mz8Var.d);
        jfp0Var.a(f, mz8Var.e);
        jfp0Var.a(g, mz8Var.f);
    }
}
