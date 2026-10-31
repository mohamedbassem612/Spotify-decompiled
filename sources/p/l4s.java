package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l4s extends onm {
    public String a;
    public du90 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iir e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4s(iir iirVar, onm onmVar) {
        super(onmVar);
        this.e = iirVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.n(null, null, null, this);
    }
}
