package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qc61 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;
    public final /* synthetic */ uc61 c;

    public /* synthetic */ qc61(xe01 xe01Var, uc61 uc61Var, byte b) {
        this.a = b;
        this.b = xe01Var;
        this.c = uc61Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        uc61 uc61Var = this.c;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new pc61(vr20Var, uc61Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = xe01Var.a.collect(new pc61(vr20Var, uc61Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
