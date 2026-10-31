package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class js8 implements ifp0 {
    public static final js8 a = new js8();
    public static final u120 b = u120.c("arch");
    public static final u120 c = u120.c("model");
    public static final u120 d = u120.c("cores");
    public static final u120 e = u120.c("ram");
    public static final u120 f = u120.c("diskSpace");
    public static final u120 g = u120.c("simulator");
    public static final u120 h = u120.c("state");
    public static final u120 i = u120.c("manufacturer");
    public static final u120 j = u120.c("modelClass");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        din dinVar = (din) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.c(b, ((kz8) dinVar).a);
        kz8 kz8Var = (kz8) dinVar;
        jfp0Var.a(c, kz8Var.b);
        jfp0Var.c(d, kz8Var.c);
        jfp0Var.e(e, kz8Var.d);
        jfp0Var.e(f, kz8Var.e);
        jfp0Var.d(g, kz8Var.f);
        jfp0Var.c(h, kz8Var.g);
        jfp0Var.a(i, kz8Var.h);
        jfp0Var.a(j, kz8Var.i);
    }
}
