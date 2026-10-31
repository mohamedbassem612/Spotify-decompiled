package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dzw extends onm {
    public ji0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ezw c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzw(ezw ezwVar, onm onmVar) {
        super(onmVar);
        this.c = ezwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        Object objA = this.c.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
