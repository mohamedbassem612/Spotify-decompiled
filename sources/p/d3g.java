package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d3g implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ any b;
    public final /* synthetic */ kp5 c;

    public /* synthetic */ d3g(any anyVar, kp5 kp5Var, byte b) {
        this.a = b;
        this.b = anyVar;
        this.c = kp5Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        kp5 kp5Var = this.c;
        any anyVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = anyVar.collect(new c3g(vr20Var, kp5Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = anyVar.collect(new c3g(vr20Var, kp5Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = anyVar.collect(new c3g(vr20Var, kp5Var, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = anyVar.collect(new c3g(vr20Var, kp5Var, (byte) 3), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
