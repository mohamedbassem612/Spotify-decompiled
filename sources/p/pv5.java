package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pv5 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mr20 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pv5(mr20 mr20Var, Object obj, long j, byte b) {
        this.a = b;
        this.c = mr20Var;
        this.d = obj;
        this.b = j;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        x010 x010Var = this.c;
        switch (b) {
            case 0:
                Object objCollect = ((fu20) x010Var).collect(new ov5(vr20Var, (yv5) obj, this.b, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = x010Var.collect(new ov5(vr20Var, (yu3) obj, this.b, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
