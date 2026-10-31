package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdk1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mnc0 b;

    public /* synthetic */ jdk1(mnc0 mnc0Var, byte b) {
        this.a = b;
        this.b = mnc0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mnc0 mnc0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mnc0Var.collect(new zmj1(vr20Var, (byte) 7), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mnc0Var.collect(new zmj1(vr20Var, (byte) 8), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
