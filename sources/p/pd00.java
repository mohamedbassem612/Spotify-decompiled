package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pd00 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mr20 c;

    public /* synthetic */ pd00(mr20 mr20Var, boolean z, byte b) {
        this.a = b;
        this.c = mr20Var;
        this.b = z;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        kge kgeVar = this.c;
        switch (b) {
            case 0:
                ((bpb1) kgeVar).collect(new od00(vr20Var, z, (byte) 0), lnmVar);
                return d9nVar;
            case 1:
                Object objCollect = kgeVar.collect(new od00(vr20Var, z, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = kgeVar.collect(new e0d0(vr20Var, z), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
