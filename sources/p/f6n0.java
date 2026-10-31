package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f6n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6n0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6n0(i6n0 i6n0Var, onm onmVar) {
        super(onmVar);
        this.b = i6n0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
