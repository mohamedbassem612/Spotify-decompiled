package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xlj1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ any b;
    public final /* synthetic */ amj1 c;

    public /* synthetic */ xlj1(any anyVar, amj1 amj1Var, byte b) {
        this.a = b;
        this.b = anyVar;
        this.c = amj1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        amj1 amj1Var = this.c;
        any anyVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = anyVar.collect(new i6e1(vr20Var, amj1Var, (byte) 23), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = anyVar.collect(new qzh1((byte) 28, amj1Var, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
