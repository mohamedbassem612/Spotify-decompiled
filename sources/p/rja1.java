package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rja1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sja1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rja1(sja1 sja1Var, onm onmVar) {
        super(onmVar);
        this.b = sja1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
