package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class blx0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fun0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blx0(fun0 fun0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = fun0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(false, this);
    }
}
