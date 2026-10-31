package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tlm0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ulm0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlm0(ulm0 ulm0Var, onm onmVar) {
        super(onmVar);
        this.b = ulm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
