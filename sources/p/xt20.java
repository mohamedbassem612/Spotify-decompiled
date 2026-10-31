package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xt20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yt20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt20(yt20 yt20Var, lnm lnmVar) {
        super(lnmVar);
        this.b = yt20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
