package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vc71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xc71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc71(xc71 xc71Var, onm onmVar) {
        super(onmVar);
        this.b = xc71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
