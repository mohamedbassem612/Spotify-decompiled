package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zhg1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cig1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhg1(cig1 cig1Var, onm onmVar) {
        super(onmVar);
        this.b = cig1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
