package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cj01 extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hj01 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj01(hj01 hj01Var, onm onmVar) {
        super(onmVar);
        this.c = hj01Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, 0L, this);
    }
}
