package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p7d0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q7d0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7d0(q7d0 q7d0Var, onm onmVar) {
        super(onmVar);
        this.b = q7d0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
