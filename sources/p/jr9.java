package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jr9 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nz7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr9(nz7 nz7Var, lnm lnmVar) {
        super(lnmVar);
        this.c = nz7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
