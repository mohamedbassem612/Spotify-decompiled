package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ckb extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bt9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckb(bt9 bt9Var, lnm lnmVar) {
        super(lnmVar);
        this.c = bt9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
