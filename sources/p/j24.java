package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j24 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ s24 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j24(s24 s24Var, lnm lnmVar) {
        super(lnmVar);
        this.b = s24Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q(null, null, null, this);
    }
}
