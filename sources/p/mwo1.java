package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mwo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nwo1 b;
    public int c;
    public rvo1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwo1(nwo1 nwo1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = nwo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
