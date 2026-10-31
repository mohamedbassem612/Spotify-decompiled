package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2b0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ k2b0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2b0(k2b0 k2b0Var, onm onmVar) {
        super(onmVar);
        this.b = k2b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
