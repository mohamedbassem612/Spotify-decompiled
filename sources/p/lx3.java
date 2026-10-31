package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lx3 extends onm {
    public mx3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mx3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx3(mx3 mx3Var, onm onmVar) {
        super(onmVar);
        this.c = mx3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        d9n d9nVarA = this.c.a(null, this);
        return d9nVarA == d9n.a ? d9nVarA : new e331(d9nVarA);
    }
}
