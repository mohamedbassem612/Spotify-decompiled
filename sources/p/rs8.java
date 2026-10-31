package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rs8 implements ifp0 {
    public static final rs8 a = new rs8();
    public static final u120 b = u120.c("pc");
    public static final u120 c = u120.c("symbol");
    public static final u120 d = u120.c("file");
    public static final u120 e = u120.c("offset");
    public static final u120 f = u120.c("importance");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        hin hinVar = (hin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.e(b, ((zz8) hinVar).a);
        zz8 zz8Var = (zz8) hinVar;
        jfp0Var.a(c, zz8Var.b);
        jfp0Var.a(d, zz8Var.c);
        jfp0Var.e(e, zz8Var.d);
        jfp0Var.c(f, zz8Var.e);
    }
}
