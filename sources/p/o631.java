package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o631 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p631 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o631(p631 p631Var, lnm lnmVar) {
        super(lnmVar);
        this.b = p631Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.invoke(this);
    }
}
