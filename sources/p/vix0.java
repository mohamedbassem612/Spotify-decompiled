package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vix0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xix0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vix0(xix0 xix0Var, onm onmVar) {
        super(onmVar);
        this.b = xix0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
