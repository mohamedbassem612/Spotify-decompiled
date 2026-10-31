package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o9d0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xnc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9d0(xnc0 xnc0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = xnc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
