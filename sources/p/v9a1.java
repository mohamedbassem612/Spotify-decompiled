package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v9a1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ baa1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9a1(baa1 baa1Var, onm onmVar) {
        super(onmVar);
        this.b = baa1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, 0L, this);
    }
}
