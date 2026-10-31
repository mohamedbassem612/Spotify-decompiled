package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class os8 implements ifp0 {
    public static final os8 a = new os8();
    public static final u120 b = u120.c("type");
    public static final u120 c = u120.c("reason");
    public static final u120 d = u120.c("frames");
    public static final u120 e = u120.c("causedBy");
    public static final u120 f = u120.c("overflowCount");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        fin finVar = (fin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((tz8) finVar).a);
        tz8 tz8Var = (tz8) finVar;
        jfp0Var.a(c, tz8Var.b);
        jfp0Var.a(d, tz8Var.c);
        jfp0Var.a(e, tz8Var.d);
        jfp0Var.c(f, tz8Var.e);
    }
}
