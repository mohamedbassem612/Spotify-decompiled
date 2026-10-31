package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class azb0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bzb0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azb0(bzb0 bzb0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = bzb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
