package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fig1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jig1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fig1(jig1 jig1Var, onm onmVar) {
        super(onmVar);
        this.b = jig1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
