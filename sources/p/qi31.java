package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qi31 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ti31 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi31(ti31 ti31Var, onm onmVar) {
        super(onmVar);
        this.c = ti31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
