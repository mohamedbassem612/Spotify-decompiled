package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n5s0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt20 b;
    public final /* synthetic */ s5s0 c;

    public /* synthetic */ n5s0(lt20 lt20Var, s5s0 s5s0Var, byte b) {
        this.a = b;
        this.b = lt20Var;
        this.c = s5s0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        s5s0 s5s0Var = this.c;
        lt20 lt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = lt20Var.collect(new m5s0(vr20Var, s5s0Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = lt20Var.collect(new m5s0(vr20Var, s5s0Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = lt20Var.collect(new m5s0(vr20Var, s5s0Var, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
