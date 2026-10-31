package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c5y0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ z4y0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5y0(z4y0 z4y0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = z4y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
