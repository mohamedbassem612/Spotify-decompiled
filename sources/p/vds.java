package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vds extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ x94 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vds(x94 x94Var, lnm lnmVar) {
        super(lnmVar);
        this.b = x94Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
