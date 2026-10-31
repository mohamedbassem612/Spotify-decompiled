package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r9s extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ y9s b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9s(y9s y9sVar, onm onmVar) {
        super(onmVar);
        this.b = y9sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this, false);
    }
}
