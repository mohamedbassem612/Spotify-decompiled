package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l2e0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ haa0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2e0(haa0 haa0Var, onm onmVar) {
        super(onmVar);
        this.b = haa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.i(this);
    }
}
