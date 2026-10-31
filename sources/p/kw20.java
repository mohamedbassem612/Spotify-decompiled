package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kw20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public final /* synthetic */ lw20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw20(lw20 lw20Var, lnm lnmVar) {
        super(lnmVar);
        this.d = lw20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
