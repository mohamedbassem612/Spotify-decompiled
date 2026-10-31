package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lqh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ alg1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqh1(alg1 alg1Var, onm onmVar) {
        super(onmVar);
        this.b = alg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
