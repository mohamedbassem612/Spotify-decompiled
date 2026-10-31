package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z2e0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a3e0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2e0(a3e0 a3e0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = a3e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.invoke(this);
    }
}
