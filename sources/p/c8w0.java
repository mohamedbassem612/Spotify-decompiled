package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8w0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ d8w0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8w0(d8w0 d8w0Var, onm onmVar) {
        super(onmVar);
        this.b = d8w0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = this.b.k(this);
        return objK == d9n.a ? objK : new e331(objK);
    }
}
