package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nxj0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ any b;
    public final /* synthetic */ kqi0 c;

    public /* synthetic */ nxj0(any anyVar, kqi0 kqi0Var, byte b) {
        this.a = b;
        this.b = anyVar;
        this.c = kqi0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        kqi0 kqi0Var = this.c;
        any anyVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = anyVar.collect(new xtj0((byte) 17, kqi0Var, vr20Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = anyVar.collect(new xtj0((byte) 19, kqi0Var, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
