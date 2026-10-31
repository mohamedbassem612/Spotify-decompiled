package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z5b1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a6b1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5b1(a6b1 a6b1Var, onm onmVar) {
        super(onmVar);
        this.b = a6b1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
