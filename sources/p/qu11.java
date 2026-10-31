package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qu11 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ru11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu11(ru11 ru11Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ru11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
