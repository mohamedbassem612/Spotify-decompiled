package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h4h1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ i4h1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4h1(i4h1 i4h1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = i4h1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
