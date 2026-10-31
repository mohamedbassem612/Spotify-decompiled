package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tmu0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ umu0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmu0(umu0 umu0Var, onm onmVar) {
        super(onmVar);
        this.b = umu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
