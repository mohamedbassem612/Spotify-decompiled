package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cl0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ il0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl0(il0 il0Var, onm onmVar) {
        super(onmVar);
        this.b = il0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.a(this);
    }
}
