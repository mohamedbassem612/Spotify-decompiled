package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v010 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ w010 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v010(w010 w010Var, lnm lnmVar) {
        super(lnmVar);
        this.c = w010Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
