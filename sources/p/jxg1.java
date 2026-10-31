package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jxg1 extends onm {
    public dt71 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bda1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg1(bda1 bda1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = bda1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(false, this);
    }
}
