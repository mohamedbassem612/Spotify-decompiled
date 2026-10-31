package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class btu0 extends onm {
    public wsc0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ctu0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btu0(ctu0 ctu0Var, onm onmVar) {
        super(onmVar);
        this.c = ctu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
