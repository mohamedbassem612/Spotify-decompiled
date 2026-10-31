package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vpr implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iib b;

    public /* synthetic */ vpr(iib iibVar, byte b) {
        this.a = b;
        this.b = iibVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        iib iibVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = iibVar.collect(new rir(vr20Var, (byte) 12), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = iibVar.collect(new fmh0(vr20Var, (byte) 13), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
