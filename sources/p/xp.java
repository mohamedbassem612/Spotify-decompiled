package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class xp extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ yp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(yp ypVar, lnm lnmVar) {
        super(lnmVar);
        this.c = ypVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
