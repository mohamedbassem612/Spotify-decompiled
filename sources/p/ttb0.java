package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ttb0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xtb0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttb0(xtb0 xtb0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = xtb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(0, 0, this);
    }
}
