package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dge extends onm {
    public mr20 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ege c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dge(ege egeVar, lnm lnmVar) {
        super(lnmVar);
        this.c = egeVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
