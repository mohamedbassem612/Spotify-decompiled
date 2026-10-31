package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k1d0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ om70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1d0(om70 om70Var, lnm lnmVar) {
        super(lnmVar);
        this.c = om70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
