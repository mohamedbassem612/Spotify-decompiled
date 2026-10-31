package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h5f0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p5b0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5f0(p5b0 p5b0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = p5b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
