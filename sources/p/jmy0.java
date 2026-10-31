package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jmy0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v4y0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmy0(v4y0 v4y0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = v4y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
