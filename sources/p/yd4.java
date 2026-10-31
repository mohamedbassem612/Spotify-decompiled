package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yd4 extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ be4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd4(be4 be4Var, onm onmVar) {
        super(onmVar);
        this.c = be4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.d(0L, (vu30) null, this);
    }
}
