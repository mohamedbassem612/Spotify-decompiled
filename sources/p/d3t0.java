package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d3t0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;
    public final /* synthetic */ dma1 c;

    public /* synthetic */ d3t0(ezc ezcVar, dma1 dma1Var, byte b) {
        this.a = b;
        this.b = ezcVar;
        this.c = dma1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        dma1 dma1Var = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new c3t0(vr20Var, dma1Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new c3t0(vr20Var, dma1Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
