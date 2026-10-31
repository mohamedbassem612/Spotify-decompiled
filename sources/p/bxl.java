package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bxl extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y0l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxl(y0l y0lVar, lnm lnmVar) {
        super(lnmVar);
        this.c = y0lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.c.emit(null, this);
    }
}
