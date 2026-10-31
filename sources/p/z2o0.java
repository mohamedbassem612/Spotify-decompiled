package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z2o0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ ln1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2o0(ln1 ln1Var, lnm lnmVar) {
        super(lnmVar);
        this.e = ln1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
