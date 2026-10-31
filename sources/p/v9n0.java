package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9n0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ phi0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9n0(phi0 phi0Var, onm onmVar) {
        super(onmVar);
        this.c = phi0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.q(null, this);
    }
}
