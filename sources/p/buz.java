package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class buz implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt20 b;

    public /* synthetic */ buz(lt20 lt20Var, byte b) {
        this.a = b;
        this.b = lt20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        lt20 lt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = lt20Var.collect(new l6z(vr20Var, (byte) 12), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = lt20Var.collect(new xnc0(vr20Var, (byte) 14), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = lt20Var.collect(new qkv0(vr20Var, (byte) 16), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = lt20Var.collect(new ae91(vr20Var, (byte) 25), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
