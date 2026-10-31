package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p6v extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q6v b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6v(q6v q6vVar, onm onmVar) {
        super(onmVar);
        this.b = q6vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k0(0L, this);
    }
}
