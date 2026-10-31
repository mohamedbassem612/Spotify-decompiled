package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class maz0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;
    public final /* synthetic */ y1u0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ maz0(kge kgeVar, y1u0 y1u0Var, String str, byte b) {
        this.a = b;
        this.b = kgeVar;
        this.c = y1u0Var;
        this.d = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.d;
        y1u0 y1u0Var = this.c;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new buc0(vr20Var, y1u0Var, str, (byte) 24), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = kgeVar.collect(new buc0(vr20Var, y1u0Var, str, (byte) 25), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
