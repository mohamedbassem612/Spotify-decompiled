package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yf40 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ eg40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf40(eg40 eg40Var, onm onmVar) {
        super(onmVar);
        this.b = eg40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
