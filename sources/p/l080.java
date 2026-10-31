package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l080 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ n080 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l080(n080 n080Var, onm onmVar) {
        super(onmVar);
        this.b = n080Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        Object objC = this.b.c(null, null, null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
