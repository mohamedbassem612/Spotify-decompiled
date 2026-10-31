package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qga extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sga b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qga(sga sgaVar, onm onmVar) {
        super(onmVar);
        this.b = sgaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, 0, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
