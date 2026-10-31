package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class flt0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dzp0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flt0(dzp0 dzp0Var, onm onmVar) {
        super(onmVar);
        this.b = dzp0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
