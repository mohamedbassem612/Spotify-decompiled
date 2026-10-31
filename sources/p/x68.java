package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x68 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x68(xe01 xe01Var, String str, byte b) {
        this.a = b;
        this.b = xe01Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new st(vr20Var, str, (byte) 11), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = xe01Var.a.collect(new dzt(vr20Var, str, (byte) 19), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = xe01Var.a.collect(new dzt(vr20Var, str, (byte) 26), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = xe01Var.a.collect(new buc0(vr20Var, str, (byte) 14), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
