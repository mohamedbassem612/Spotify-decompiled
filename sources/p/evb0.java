package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class evb0 extends onm {
    public hfn0 a;
    public a8d1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fvb0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evb0(fvb0 fvb0Var, lnm lnmVar) {
        super(lnmVar);
        this.d = fvb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.a(null, null, this);
    }
}
