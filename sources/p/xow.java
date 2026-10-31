package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xow implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;
    public final /* synthetic */ goq c;
    public final /* synthetic */ String d;

    public /* synthetic */ xow(kge kgeVar, goq goqVar, String str, byte b) {
        this.a = b;
        this.b = kgeVar;
        this.c = goqVar;
        this.d = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.d;
        goq goqVar = this.c;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new dzt(vr20Var, goqVar, str, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = kgeVar.collect(new dzt(vr20Var, goqVar, str, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
