package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fhm1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ghm1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhm1(ghm1 ghm1Var, onm onmVar) {
        super(onmVar);
        this.b = ghm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this, false);
    }
}
