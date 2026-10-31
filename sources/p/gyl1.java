package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gyl1 extends onm {
    public syl1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eyl1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyl1(eyl1 eyl1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = eyl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
