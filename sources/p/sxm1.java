package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sxm1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ owf1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxm1(owf1 owf1Var, onm onmVar) {
        super(onmVar);
        this.b = owf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.p(null, this);
    }
}
