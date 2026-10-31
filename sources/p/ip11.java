package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ip11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ op11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip11(op11 op11Var, onm onmVar) {
        super(onmVar);
        this.b = op11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((String) null, (String) null, this);
    }
}
