package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hc6 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ic6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc6(ic6 ic6Var, onm onmVar) {
        super(onmVar);
        this.b = ic6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q(null, this);
    }
}
