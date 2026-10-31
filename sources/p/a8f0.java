package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a8f0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x010 b;
    public final /* synthetic */ pbq c;

    public /* synthetic */ a8f0(x010 x010Var, pbq pbqVar, byte b) {
        this.a = b;
        this.b = x010Var;
        this.c = pbqVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        pbq pbqVar = this.c;
        x010 x010Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = x010Var.collect(new i2e0(vr20Var, pbqVar, (byte) 21), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = x010Var.collect(new i2e0(vr20Var, pbqVar, (byte) 23), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
