package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hig1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jig1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hig1(jig1 jig1Var, onm onmVar) {
        super(onmVar);
        this.b = jig1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, null, null, null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
