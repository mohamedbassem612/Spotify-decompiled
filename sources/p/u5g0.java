package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u5g0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v5g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5g0(v5g0 v5g0Var, onm onmVar) {
        super(onmVar);
        this.c = v5g0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
