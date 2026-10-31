package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pza1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qza1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pza1(qza1 qza1Var, onm onmVar) {
        super(onmVar);
        this.b = qza1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
