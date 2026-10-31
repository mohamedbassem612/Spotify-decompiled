package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mrh1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nrh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrh1(nrh1 nrh1Var, onm onmVar) {
        super(onmVar);
        this.c = nrh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
