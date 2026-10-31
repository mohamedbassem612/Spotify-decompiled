package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xvy0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hvp0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvy0(hvp0 hvp0Var, onm onmVar) {
        super(onmVar);
        this.c = hvp0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, this);
    }
}
