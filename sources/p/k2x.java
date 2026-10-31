package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k2x extends onm {
    public ji0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l2x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2x(l2x l2xVar, onm onmVar) {
        super(onmVar);
        this.c = l2xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        Object objA = this.c.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
