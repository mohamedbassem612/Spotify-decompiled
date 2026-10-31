package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ixs implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pya b;
    public final /* synthetic */ txs c;
    public final /* synthetic */ s5l d;

    public /* synthetic */ ixs(pya pyaVar, txs txsVar, s5l s5lVar, byte b) {
        this.a = b;
        this.b = pyaVar;
        this.c = txsVar;
        this.d = s5lVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        s5l s5lVar = this.d;
        txs txsVar = this.c;
        pya pyaVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = pyaVar.collect(new hxs(vr20Var, txsVar, s5lVar, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = pyaVar.collect(new hxs(vr20Var, txsVar, s5lVar, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
