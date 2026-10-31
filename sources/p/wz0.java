package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wz0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nwd b;

    public /* synthetic */ wz0(nwd nwdVar, byte b) {
        this.a = b;
        this.b = nwdVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        nwd nwdVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = nwdVar.collect(new mf(vr20Var, (byte) 26), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = nwdVar.collect(new x1h(vr20Var, (byte) 9), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = nwdVar.collect(new cy20(vr20Var, (byte) 16), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = nwdVar.collect(new qmd1(vr20Var, (byte) 16), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
