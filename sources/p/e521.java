package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e521 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e521(lt20 lt20Var, String str, byte b) {
        this.a = b;
        this.b = lt20Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        lt20 lt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = lt20Var.collect(new ru11(vr20Var, str, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = lt20Var.collect(new ru11(vr20Var, str, (byte) 22), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
