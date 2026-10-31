package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vtz extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fey c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtz(fey feyVar, onm onmVar) {
        super(onmVar);
        this.c = feyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.g(null, null, this);
    }
}
