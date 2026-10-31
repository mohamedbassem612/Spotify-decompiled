package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mkm extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qkm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkm(qkm qkmVar, onm onmVar) {
        super(onmVar);
        this.b = qkmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
