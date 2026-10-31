package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qi10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ti10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi10(ti10 ti10Var, onm onmVar) {
        super(onmVar);
        this.b = ti10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
