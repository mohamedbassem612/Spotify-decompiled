package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class abm0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bbm0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abm0(bbm0 bbm0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = bbm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
