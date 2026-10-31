package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oxs extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ txs c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxs(txs txsVar, lnm lnmVar) {
        super(lnmVar);
        this.c = txsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((String) null, this);
    }
}
