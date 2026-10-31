package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mec1 extends onm {
    public rm5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rec1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mec1(rec1 rec1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = rec1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.W(null, null, this);
    }
}
