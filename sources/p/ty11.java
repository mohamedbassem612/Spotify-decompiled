package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ty11 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uy11 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty11(uy11 uy11Var, onm onmVar) {
        super(onmVar);
        this.c = uy11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
