package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s1x extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ t1x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1x(t1x t1xVar, lnm lnmVar) {
        super(lnmVar);
        this.c = t1xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.c.emit(null, this);
    }
}
