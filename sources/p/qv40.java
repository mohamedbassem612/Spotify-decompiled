package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qv40 implements iu30 {
    public final /* synthetic */ byte a;
    public final iu30 b;

    public /* synthetic */ qv40(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                nv91 nv91Var = (nv91) obj;
                synchronized (pv91.c) {
                    j = pv91.e;
                    pv91.e = 1 + j;
                }
                return new we01(j, nv91Var, this.b);
            default:
                iu30 iu30Var = this.b;
                a8b0 a8b0Var = (a8b0) obj;
                a8b0Var.getClass();
                return iu30Var.invoke(a8b0Var).toString();
        }
    }
}
