package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qn0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rn0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(rn0 rn0Var, onm onmVar) {
        super(onmVar);
        this.b = rn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, 0, null, this);
    }
}
