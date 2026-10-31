package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ aab b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9b(aab aabVar, onm onmVar) {
        super(onmVar);
        this.b = aabVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
