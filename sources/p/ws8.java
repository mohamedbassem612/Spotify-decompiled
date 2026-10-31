package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ws8 implements ifp0 {
    public static final ws8 a = new ws8();
    public static final u120 b = u120.c("rolloutVariant");
    public static final u120 c = u120.c("parameterKey");
    public static final u120 d = u120.c("parameterValue");
    public static final u120 e = u120.c("templateVersion");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        pin pinVar = (pin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((g09) pinVar).a);
        g09 g09Var = (g09) pinVar;
        jfp0Var.a(c, g09Var.b);
        jfp0Var.a(d, g09Var.c);
        jfp0Var.e(e, g09Var.d);
    }
}
