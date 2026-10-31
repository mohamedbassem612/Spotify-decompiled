package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wpg0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ypg0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpg0(ypg0 ypg0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = ypg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.collect(null, this);
        return d9n.a;
    }
}
