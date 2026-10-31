package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fj01 extends onm {
    public long a;
    public hj01 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hj01 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj01(hj01 hj01Var, onm onmVar) {
        super(onmVar);
        this.d = hj01Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
