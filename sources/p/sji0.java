package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sji0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tji0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sji0(tji0 tji0Var, onm onmVar) {
        super(onmVar);
        this.b = tji0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this, false);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
