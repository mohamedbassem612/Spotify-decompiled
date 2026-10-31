package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tlj1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bda1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlj1(bda1 bda1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = bda1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((rlj1) null, this);
    }
}
