package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xut extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ k9t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xut(k9t k9tVar, lnm lnmVar) {
        super(lnmVar);
        this.c = k9tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
