package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class apw implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;
    public final /* synthetic */ String c;

    public /* synthetic */ apw(kge kgeVar, String str, byte b) {
        this.a = b;
        this.b = kgeVar;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new dzt(vr20Var, str, (byte) 3), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = kgeVar.collect(new ru11(vr20Var, str, (byte) 7), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = kgeVar.collect(new ru11(vr20Var, str, (byte) 15), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
