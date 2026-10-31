package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u5b0 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w5b0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5b0(w5b0 w5b0Var, onm onmVar) {
        super(onmVar);
        this.c = w5b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0, this);
    }
}
