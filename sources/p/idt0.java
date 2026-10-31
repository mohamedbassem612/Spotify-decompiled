package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class idt0 extends onm {
    public Object a;
    public Object b;
    public xgn0 c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ndt0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idt0(ndt0 ndt0Var, onm onmVar) {
        super(onmVar);
        this.f = ndt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.b(null, 0L, null, this);
    }
}
