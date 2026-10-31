package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q9b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9b(q9b q9bVar, onm onmVar) {
        super(onmVar);
        this.b = q9bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
