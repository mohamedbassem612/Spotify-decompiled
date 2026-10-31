package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wya extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ f64 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wya(f64 f64Var, lnm lnmVar) {
        super(lnmVar);
        this.c = f64Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
