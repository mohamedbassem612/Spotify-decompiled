package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class klh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ h5a1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klh1(h5a1 h5a1Var, onm onmVar) {
        super(onmVar);
        this.b = h5a1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k((String) null, this);
    }
}
