package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hcg1 extends onm {
    public boolean a;
    public String b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ptf1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcg1(ptf1 ptf1Var, onm onmVar) {
        super(onmVar);
        this.e = ptf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(0L, null, this, false);
    }
}
