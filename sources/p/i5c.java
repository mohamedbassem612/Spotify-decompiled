package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i5c extends onm {
    public n511 a;
    public Object[] b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ j5c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5c(j5c j5cVar, lnm lnmVar) {
        super(lnmVar);
        this.f = j5cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.a(null, this);
    }
}
