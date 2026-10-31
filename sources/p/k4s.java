package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4s extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ iir b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4s(iir iirVar, onm onmVar) {
        super(onmVar);
        this.b = iirVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(null, this);
    }
}
