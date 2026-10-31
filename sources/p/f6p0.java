package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f6p0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public vr20 d;
    public int e;
    public final /* synthetic */ g6p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6p0(g6p0 g6p0Var, lnm lnmVar) {
        super(lnmVar);
        this.f = g6p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
