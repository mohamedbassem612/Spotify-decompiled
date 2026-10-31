package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i3g0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ k3g0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3g0(k3g0 k3g0Var, onm onmVar) {
        super(onmVar);
        this.b = k3g0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(null, false, this);
    }
}
