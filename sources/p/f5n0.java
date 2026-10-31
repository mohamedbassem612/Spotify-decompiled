package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f5n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tym0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5n0(tym0 tym0Var, onm onmVar) {
        super(onmVar);
        this.b = tym0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
