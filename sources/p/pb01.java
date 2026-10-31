package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pb01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qb01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb01(qb01 qb01Var, onm onmVar) {
        super(onmVar);
        this.b = qb01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, 0, 0, false, 0L, 0L, this);
    }
}
