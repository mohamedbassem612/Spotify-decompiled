package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ofh1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rfh1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofh1(rfh1 rfh1Var, onm onmVar) {
        super(onmVar);
        this.c = rfh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
