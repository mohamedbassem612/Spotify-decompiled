package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ptp0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ ygi0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptp0(ygi0 ygi0Var, lnm lnmVar) {
        super(lnmVar);
        this.e = ygi0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
