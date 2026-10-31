package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ss8 implements ifp0 {
    public static final ss8 a = new ss8();
    public static final u120 b = u120.c("processName");
    public static final u120 c = u120.c("pid");
    public static final u120 d = u120.c("importance");
    public static final u120 e = u120.c("defaultProcess");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        kin kinVar = (kin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((b09) kinVar).a);
        b09 b09Var = (b09) kinVar;
        jfp0Var.c(c, b09Var.b);
        jfp0Var.c(d, b09Var.c);
        jfp0Var.d(e, b09Var.d);
    }
}
