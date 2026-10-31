package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mmk1 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nmk1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmk1(nmk1 nmk1Var, onm onmVar) {
        super(onmVar);
        this.c = nmk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        d9n d9nVarC = this.c.c(false, this);
        return d9nVarC == d9n.a ? d9nVarC : new e331(d9nVarC);
    }
}
