package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y431 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ z431 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y431(z431 z431Var, onm onmVar) {
        super(onmVar);
        this.b = z431Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
