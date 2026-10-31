package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q4s0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tzr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4s0(tzr0 tzr0Var, onm onmVar) {
        super(onmVar);
        this.b = tzr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarI = this.b.i(null, null, this);
        return d9nVarI == d9n.a ? d9nVarI : new e331(d9nVarI);
    }
}
