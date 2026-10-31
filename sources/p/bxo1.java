package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bxo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ exo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxo1(exo1 exo1Var, onm onmVar) {
        super(onmVar);
        this.b = exo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
