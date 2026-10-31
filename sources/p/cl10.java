package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cl10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dl10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl10(dl10 dl10Var, onm onmVar) {
        super(onmVar);
        this.b = dl10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
