package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zs8 implements ifp0 {
    public static final zs8 a = new zs8();
    public static final u120 b = u120.c("platform");
    public static final u120 c = u120.c("version");
    public static final u120 d = u120.c("buildVersion");
    public static final u120 e = u120.c("jailbroken");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        sin sinVar = (sin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.c(b, ((l09) sinVar).a);
        l09 l09Var = (l09) sinVar;
        jfp0Var.a(c, l09Var.b);
        jfp0Var.a(d, l09Var.c);
        jfp0Var.d(e, l09Var.d);
    }
}
