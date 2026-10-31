package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b4y0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ p0x0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4y0(p0x0 p0x0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = p0x0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
