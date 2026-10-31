package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mkr0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nkr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkr0(nkr0 nkr0Var, onm onmVar) {
        super(onmVar);
        this.b = nkr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.a((bs41) null, 0.0f, this);
    }
}
