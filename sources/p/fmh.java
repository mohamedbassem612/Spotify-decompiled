package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fmh extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gmh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmh(gmh gmhVar, onm onmVar) {
        super(onmVar);
        this.b = gmhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
