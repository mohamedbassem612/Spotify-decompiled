package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ptl1 extends onm {
    public py21 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qtl1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptl1(qtl1 qtl1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = qtl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
