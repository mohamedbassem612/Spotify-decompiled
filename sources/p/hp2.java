package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hp2 extends onm {
    public tn2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fq2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp2(fq2 fq2Var, onm onmVar) {
        super(onmVar);
        this.c = fq2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((tn2) null, false, this);
    }
}
