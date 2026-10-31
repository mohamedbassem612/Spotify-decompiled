package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y010 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ a110 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y010(a110 a110Var, lnm lnmVar) {
        super(lnmVar);
        this.c = a110Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
