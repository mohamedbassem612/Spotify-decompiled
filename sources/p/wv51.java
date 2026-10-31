package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wv51 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xv51 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv51(xv51 xv51Var, onm onmVar) {
        super(onmVar);
        this.c = xv51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
