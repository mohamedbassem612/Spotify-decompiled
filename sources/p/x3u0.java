package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x3u0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ z3u0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3u0(z3u0 z3u0Var, onm onmVar) {
        super(onmVar);
        this.b = z3u0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
