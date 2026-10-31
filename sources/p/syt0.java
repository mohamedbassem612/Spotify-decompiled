package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syt0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ uyt0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syt0(uyt0 uyt0Var, onm onmVar) {
        super(onmVar);
        this.b = uyt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
