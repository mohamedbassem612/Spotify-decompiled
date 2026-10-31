package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c6b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ic9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6b(ic9 ic9Var, onm onmVar) {
        super(onmVar);
        this.b = ic9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.k(this);
    }
}
