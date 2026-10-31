package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oy70 extends onm {
    public String a;
    public Exception b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ py70 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy70(py70 py70Var, onm onmVar) {
        super(onmVar);
        this.e = py70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, this);
    }
}
