package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class he50 {
    public static final long a;

    static {
        int i = u7h.l;
        a = nfb.i();
    }

    public static final be50 a(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        yd50 yd50Var = (yd50) x340Var.k(t4k.g);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new zd50(yd50Var);
            x340Var.s0(objT);
        }
        return ((zd50) objT).a();
    }
}
