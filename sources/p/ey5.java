package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ey5 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fy5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey5(fy5 fy5Var, onm onmVar) {
        super(onmVar);
        this.b = fy5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        this.b.b(null, this);
        return d9n.a;
    }
}
