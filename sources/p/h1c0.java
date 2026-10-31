package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h1c0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i1c0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1c0(i1c0 i1c0Var, onm onmVar) {
        super(onmVar);
        this.b = i1c0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, this);
    }
}
