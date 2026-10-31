package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q6c0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ om70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6c0(om70 om70Var, lnm lnmVar) {
        super(lnmVar);
        this.e = om70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
