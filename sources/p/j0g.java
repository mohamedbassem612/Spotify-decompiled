package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j0g implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wef b;

    public /* synthetic */ j0g(wef wefVar, byte b) {
        this.a = b;
        this.b = wefVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        wef wefVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = wefVar.collect(new kmf(vr20Var, (byte) 6), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = wefVar.collect(new kmf(vr20Var, (byte) 7), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
