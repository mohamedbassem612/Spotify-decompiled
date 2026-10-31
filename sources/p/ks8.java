package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ks8 implements ifp0 {
    public static final ks8 a = new ks8();
    public static final u120 b = u120.c("generator");
    public static final u120 c = u120.c("identifier");
    public static final u120 d = u120.c("appQualitySessionId");
    public static final u120 e = u120.c("startedAt");
    public static final u120 f = u120.c("endedAt");
    public static final u120 g = u120.c("crashed");
    public static final u120 h = u120.c("app");
    public static final u120 i = u120.c("user");
    public static final u120 j = u120.c("os");
    public static final u120 k = u120.c("device");
    public static final u120 l = u120.c("events");
    public static final u120 m = u120.c("generatorType");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        uin uinVar = (uin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((gz8) uinVar).a);
        gz8 gz8Var = (gz8) uinVar;
        jfp0Var.a(c, gz8Var.b.getBytes(vin.a));
        jfp0Var.a(d, gz8Var.c);
        jfp0Var.e(e, gz8Var.d);
        jfp0Var.a(f, gz8Var.e);
        jfp0Var.d(g, gz8Var.f);
        jfp0Var.a(h, gz8Var.g);
        jfp0Var.a(i, gz8Var.h);
        jfp0Var.a(j, gz8Var.i);
        jfp0Var.a(k, gz8Var.j);
        jfp0Var.a(l, gz8Var.k);
        jfp0Var.c(m, gz8Var.l);
    }
}
