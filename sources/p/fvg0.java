package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fvg0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ivg0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvg0(ivg0 ivg0Var, onm onmVar) {
        super(onmVar);
        this.b = ivg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
