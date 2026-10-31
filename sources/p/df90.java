package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class df90 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vx40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df90(vx40 vx40Var, onm onmVar) {
        super(onmVar);
        this.b = vx40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.u(0, this);
    }
}
