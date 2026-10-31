package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ayg0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ byg0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg0(byg0 byg0Var, onm onmVar) {
        super(onmVar);
        this.b = byg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
