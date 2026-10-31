package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n261 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ he11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n261(he11 he11Var, onm onmVar) {
        super(onmVar);
        this.b = he11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
