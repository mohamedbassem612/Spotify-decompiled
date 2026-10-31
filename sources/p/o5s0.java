package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o5s0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ m5s0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5s0(m5s0 m5s0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = m5s0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
