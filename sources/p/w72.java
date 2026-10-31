package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w72 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pl1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(pl1 pl1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = pl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
