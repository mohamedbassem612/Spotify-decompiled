package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ia8 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lls0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia8(lls0 lls0Var, onm onmVar) {
        super(onmVar);
        this.b = lls0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.u(null, this);
    }
}
