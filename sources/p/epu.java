package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class epu extends onm {
    public dpu a;
    public xgn0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fpu d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epu(fpu fpuVar, onm onmVar) {
        super(onmVar);
        this.d = fpuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
