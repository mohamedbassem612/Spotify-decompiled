package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class czw extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ezw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czw(ezw ezwVar, onm onmVar) {
        super(onmVar);
        this.b = ezwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.e(null, this);
    }
}
