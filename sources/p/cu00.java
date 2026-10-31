package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cu00 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mr20 c;

    public /* synthetic */ cu00(mr20 mr20Var, int i, byte b) {
        this.a = b;
        this.c = mr20Var;
        this.b = i;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        int i = this.b;
        bge bgeVar = this.c;
        switch (b) {
            case 0:
                Object objCollect = bgeVar.collect(new bu00(vr20Var, i, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((m441) bgeVar).collect(new bu00(vr20Var, i, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = bgeVar.collect(new bu00(vr20Var, i, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
