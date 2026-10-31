package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class td0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ud0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(ud0 ud0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ud0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
