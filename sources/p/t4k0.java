package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t4k0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xtj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4k0(xtj0 xtj0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = xtj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
