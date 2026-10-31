package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6z implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ huz b;

    public /* synthetic */ o6z(huz huzVar, byte b) {
        this.a = b;
        this.b = huzVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        huz huzVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = huzVar.collect(new l6z(vr20Var, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = huzVar.collect(new dfu0(vr20Var, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
