package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jx8 implements ifp0 {
    public static final jx8 a = new jx8();
    public static final u120 b = u120.c("eventType");
    public static final u120 c = u120.c("sessionData");
    public static final u120 d = u120.c("applicationInfo");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        le61 le61Var = (le61) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        le61Var.getClass();
        jfp0Var.a(b, xd00.SESSION_START);
        jfp0Var.a(c, le61Var.a);
        jfp0Var.a(d, le61Var.b);
    }
}
