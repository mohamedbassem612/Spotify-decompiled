package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rgh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ffe1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgh1(ffe1 ffe1Var, onm onmVar) {
        super(onmVar);
        this.b = ffe1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(false, this);
    }
}
