package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vjl1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xjl1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjl1(xjl1 xjl1Var, onm onmVar) {
        super(onmVar);
        this.b = xjl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
