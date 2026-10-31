package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bp20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cp20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp20(cp20 cp20Var, lnm lnmVar) {
        super(lnmVar);
        this.b = cp20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.collect(null, this);
        return d9n.a;
    }
}
