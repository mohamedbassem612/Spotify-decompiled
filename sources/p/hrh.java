package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hrh extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ krh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrh(krh krhVar, onm onmVar) {
        super(onmVar);
        this.b = krhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b((ql10) null, this);
    }
}
