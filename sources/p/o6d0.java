package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o6d0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;

    public /* synthetic */ o6d0(kge kgeVar, byte b) {
        this.a = b;
        this.b = kgeVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new xnc0(vr20Var, (byte) 15), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = kgeVar.collect(new dfu0(vr20Var, (byte) 4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = kgeVar.collect(new dfu0(vr20Var, (byte) 28), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
