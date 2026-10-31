package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1e0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ m1e0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1e0(m1e0 m1e0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = m1e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
