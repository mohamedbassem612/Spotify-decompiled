package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mgd0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ngd0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgd0(ngd0 ngd0Var, onm onmVar) {
        super(onmVar);
        this.b = ngd0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((frd1) null, this);
    }
}
