package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jie0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mie0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie0(mie0 mie0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = mie0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
