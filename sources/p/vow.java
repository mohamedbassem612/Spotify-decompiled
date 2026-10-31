package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vow implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;
    public final /* synthetic */ goq c;

    public /* synthetic */ vow(kge kgeVar, goq goqVar, byte b) {
        this.a = b;
        this.b = kgeVar;
        this.c = goqVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        goq goqVar = this.c;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new ryr(vr20Var, goqVar, (byte) 23), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = kgeVar.collect(new fwv(vr20Var, goqVar), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
