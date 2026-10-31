package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l2b1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cza1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2b1(cza1 cza1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = cza1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.c.emit(null, this);
    }
}
