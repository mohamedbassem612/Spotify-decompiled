package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gu20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ o010 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu20(o010 o010Var, lnm lnmVar) {
        super(lnmVar);
        this.b = o010Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((mr20) null, this);
    }
}
