package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i110 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ oq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i110(oq0 oq0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = oq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
