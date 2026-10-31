package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uec0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xec0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uec0(xec0 xec0Var, onm onmVar) {
        super(onmVar);
        this.b = xec0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
