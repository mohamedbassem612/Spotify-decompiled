package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m2x extends onm {
    public ji0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n2x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2x(n2x n2xVar, onm onmVar) {
        super(onmVar);
        this.c = n2xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        Object objA = this.c.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
