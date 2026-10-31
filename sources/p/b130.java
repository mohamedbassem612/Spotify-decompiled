package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b130 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mjv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b130(mjv mjvVar, onm onmVar) {
        super(onmVar);
        this.b = mjvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarB = this.b.b(null, this);
        return d9nVarB == d9n.a ? d9nVarB : new e331(d9nVarB);
    }
}
