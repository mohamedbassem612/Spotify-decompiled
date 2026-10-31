package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2k1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zmj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2k1(zmj1 zmj1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = zmj1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
