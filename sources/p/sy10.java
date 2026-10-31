package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sy10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ uy10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy10(uy10 uy10Var, onm onmVar) {
        super(onmVar);
        this.b = uy10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
