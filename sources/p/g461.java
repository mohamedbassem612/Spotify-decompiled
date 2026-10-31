package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g461 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ up41 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g461(up41 up41Var, onm onmVar) {
        super(onmVar);
        this.b = up41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objR = this.b.r(null, null, null, false, false, this);
        return objR == d9n.a ? objR : new e331(objR);
    }
}
