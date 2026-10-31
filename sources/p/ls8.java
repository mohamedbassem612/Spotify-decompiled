package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ls8 implements ifp0 {
    public static final ls8 a = new ls8();
    public static final u120 b = u120.c("execution");
    public static final u120 c = u120.c("customAttributes");
    public static final u120 d = u120.c("internalKeys");
    public static final u120 e = u120.c("background");
    public static final u120 f = u120.c("currentProcessDetails");
    public static final u120 g = u120.c("appProcessDetails");
    public static final u120 h = u120.c("uiOrientation");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        lin linVar = (lin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((oz8) linVar).a);
        oz8 oz8Var = (oz8) linVar;
        jfp0Var.a(c, oz8Var.b);
        jfp0Var.a(d, oz8Var.c);
        jfp0Var.a(e, oz8Var.d);
        jfp0Var.a(f, oz8Var.e);
        jfp0Var.a(g, oz8Var.f);
        jfp0Var.c(h, oz8Var.g);
    }
}
