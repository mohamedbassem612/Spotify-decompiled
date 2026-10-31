package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qt40 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cy20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt40(cy20 cy20Var, lnm lnmVar) {
        super(lnmVar);
        this.c = cy20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
