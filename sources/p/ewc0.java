package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewc0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xvc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewc0(xvc0 xvc0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = xvc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
