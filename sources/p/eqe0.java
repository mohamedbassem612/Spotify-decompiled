package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eqe0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fqe0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqe0(fqe0 fqe0Var, onm onmVar) {
        super(onmVar);
        this.b = fqe0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
