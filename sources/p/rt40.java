package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rt40 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bge b;

    public /* synthetic */ rt40(bge bgeVar, byte b) {
        this.a = b;
        this.b = bgeVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        bge bgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = bgeVar.collect(new cy20(vr20Var, (byte) 24), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = bgeVar.collect(new j4p0(vr20Var, (byte) 5), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = bgeVar.collect(new r4t0(vr20Var, (byte) 23), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
