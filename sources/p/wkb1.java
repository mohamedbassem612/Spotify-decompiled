package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wkb1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xkb1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkb1(xkb1 xkb1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = xkb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        this.c.collect(null, this);
        return d9n.a;
    }
}
