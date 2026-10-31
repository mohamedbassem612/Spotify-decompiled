package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wu20 extends onm {
    public p811 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e8m c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu20(e8m e8mVar, lnm lnmVar) {
        super(lnmVar);
        this.c = e8mVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
