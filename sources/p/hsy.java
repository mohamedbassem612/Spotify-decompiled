package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hsy extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fdc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsy(fdc fdcVar, onm onmVar) {
        super(onmVar);
        this.c = fdcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.Z(null, this);
    }
}
