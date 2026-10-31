package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zx40 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ay40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx40(ay40 ay40Var, onm onmVar) {
        super(onmVar);
        this.b = ay40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.b.d(this);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
