package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cs20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ es20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs20(es20 es20Var, onm onmVar) {
        super(onmVar);
        this.b = es20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, this);
    }
}
