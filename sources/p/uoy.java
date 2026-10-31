package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uoy implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;
    public final /* synthetic */ xoy c;
    public final /* synthetic */ koy d;

    public /* synthetic */ uoy(ay8 ay8Var, xoy xoyVar, koy koyVar, byte b) {
        this.a = b;
        this.b = ay8Var;
        this.c = xoyVar;
        this.d = koyVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        koy koyVar = this.d;
        xoy xoyVar = this.c;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new toy(vr20Var, xoyVar, koyVar, (byte) 0), lnmVar);
                break;
            default:
                ay8Var.collect(new toy(vr20Var, xoyVar, koyVar, (byte) 1), lnmVar);
                break;
        }
        return d9nVar;
    }
}
