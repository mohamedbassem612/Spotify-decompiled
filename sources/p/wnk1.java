package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wnk1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xnk1 c;
    public jnk1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnk1(xnk1 xnk1Var, onm onmVar) {
        super(onmVar);
        this.c = xnk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
