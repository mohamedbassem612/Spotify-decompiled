package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f6o0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g6o0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6o0(g6o0 g6o0Var, onm onmVar) {
        super(onmVar);
        this.b = g6o0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.c(0L, this);
    }
}
