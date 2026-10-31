package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class akc0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dg90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc0(dg90 dg90Var, onm onmVar) {
        super(onmVar);
        this.b = dg90Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.p(null, null, this);
    }
}
