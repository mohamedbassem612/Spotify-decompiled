package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ts8 implements ifp0 {
    public static final ts8 a = new ts8();
    public static final u120 b = u120.c("batteryLevel");
    public static final u120 c = u120.c("batteryVelocity");
    public static final u120 d = u120.c("proximityOn");
    public static final u120 e = u120.c("orientation");
    public static final u120 f = u120.c("ramUsed");
    public static final u120 g = u120.c("diskUsed");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        min minVar = (min) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((d09) minVar).a);
        d09 d09Var = (d09) minVar;
        jfp0Var.c(c, d09Var.b);
        jfp0Var.d(d, d09Var.c);
        jfp0Var.c(e, d09Var.d);
        jfp0Var.e(f, d09Var.e);
        jfp0Var.e(g, d09Var.f);
    }
}
