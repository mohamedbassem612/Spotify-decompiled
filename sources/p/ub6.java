package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ub6 extends onm {
    public y2r0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f64 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub6(f64 f64Var, lnm lnmVar) {
        super(lnmVar);
        this.c = f64Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
