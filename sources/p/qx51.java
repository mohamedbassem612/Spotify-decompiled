package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qx51 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tx51 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx51(tx51 tx51Var, onm onmVar) {
        super(onmVar);
        this.b = tx51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
