package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kzl1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ any b;
    public final /* synthetic */ mzl1 c;

    public /* synthetic */ kzl1(any anyVar, mzl1 mzl1Var, byte b) {
        this.a = b;
        this.b = anyVar;
        this.c = mzl1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mzl1 mzl1Var = this.c;
        any anyVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = anyVar.collect(new jzl1(vr20Var, mzl1Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = anyVar.collect(new jzl1(vr20Var, mzl1Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
