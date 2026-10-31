package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aig0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ big0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aig0(big0 big0Var, onm onmVar) {
        super(onmVar);
        this.c = big0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
