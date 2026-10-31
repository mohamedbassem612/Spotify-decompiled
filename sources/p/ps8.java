package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ps8 implements ifp0 {
    public static final ps8 a = new ps8();
    public static final u120 b = u120.c("name");
    public static final u120 c = u120.c("code");
    public static final u120 d = u120.c("address");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        gin ginVar = (gin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((vz8) ginVar).a);
        vz8 vz8Var = (vz8) ginVar;
        jfp0Var.a(c, vz8Var.b);
        jfp0Var.e(d, vz8Var.c);
    }
}
