package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class olu extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ e8m b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olu(e8m e8mVar, lnm lnmVar) {
        super(lnmVar);
        this.b = e8mVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
