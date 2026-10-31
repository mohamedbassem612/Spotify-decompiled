package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iw20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jw20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw20(jw20 jw20Var, lnm lnmVar) {
        super(lnmVar);
        this.b = jw20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B0(this);
    }
}
