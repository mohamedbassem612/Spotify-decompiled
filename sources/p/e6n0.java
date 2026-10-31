package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e6n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6n0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6n0(i6n0 i6n0Var, onm onmVar) {
        super(onmVar);
        this.b = i6n0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
