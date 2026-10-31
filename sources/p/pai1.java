package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pai1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tai1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pai1(tai1 tai1Var, onm onmVar) {
        super(onmVar);
        this.b = tai1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
