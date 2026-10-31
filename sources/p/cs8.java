package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cs8 implements ifp0 {
    public static final cs8 a = new cs8();
    public static final u120 b = u120.c("pid");
    public static final u120 c = u120.c("processName");
    public static final u120 d = u120.c("reasonCode");
    public static final u120 e = u120.c("importance");
    public static final u120 f = u120.c("pss");
    public static final u120 g = u120.c("rss");
    public static final u120 h = u120.c("timestamp");
    public static final u120 i = u120.c("traceFile");
    public static final u120 j = u120.c("buildIdMappingForArch");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        xhn xhnVar = (xhn) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.c(b, ((xy8) xhnVar).a);
        xy8 xy8Var = (xy8) xhnVar;
        jfp0Var.a(c, xy8Var.b);
        jfp0Var.c(d, xy8Var.c);
        jfp0Var.c(e, xy8Var.d);
        jfp0Var.e(f, xy8Var.e);
        jfp0Var.e(g, xy8Var.f);
        jfp0Var.e(h, xy8Var.g);
        jfp0Var.a(i, xy8Var.h);
        jfp0Var.a(j, xy8Var.i);
    }
}
