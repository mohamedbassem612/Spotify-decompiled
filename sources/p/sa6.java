package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sa6 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ua6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa6(ua6 ua6Var, onm onmVar) {
        super(onmVar);
        this.b = ua6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
