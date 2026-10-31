package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j9z extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lqr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9z(lqr lqrVar, onm onmVar) {
        super(onmVar);
        this.c = lqrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, this);
    }
}
