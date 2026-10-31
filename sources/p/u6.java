package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6 extends onm {
    public h441 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m441 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(m441 m441Var, lnm lnmVar) {
        super(lnmVar);
        this.c = m441Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
