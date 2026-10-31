package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class op01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pp01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op01(pp01 pp01Var, onm onmVar) {
        super(onmVar);
        this.b = pp01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
