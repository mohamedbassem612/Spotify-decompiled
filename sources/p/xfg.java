package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xfg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ek1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfg(ek1 ek1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = ek1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
