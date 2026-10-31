package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j4q0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ k4q0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4q0(k4q0 k4q0Var, onm onmVar) {
        super(onmVar);
        this.b = k4q0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarC = this.b.c(this);
        return d9nVarC == d9n.a ? d9nVarC : new e331(d9nVarC);
    }
}
