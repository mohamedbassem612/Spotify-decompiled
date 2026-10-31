package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o260 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ uk50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o260(uk50 uk50Var, lnm lnmVar) {
        super(lnmVar);
        this.c = uk50Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
