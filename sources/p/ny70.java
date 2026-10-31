package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ny70 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ py70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny70(py70 py70Var, onm onmVar) {
        super(onmVar);
        this.c = py70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this, false);
    }
}
