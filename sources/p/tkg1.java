package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tkg1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ptf1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkg1(ptf1 ptf1Var, onm onmVar) {
        super(onmVar);
        this.c = ptf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.u(null, null, this);
    }
}
