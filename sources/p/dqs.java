package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dqs extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ eqs b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqs(eqs eqsVar, onm onmVar) {
        super(onmVar);
        this.b = eqsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this, false);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
