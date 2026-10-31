package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpf extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kpf c;
    public r261 d;
    public gpf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpf(kpf kpfVar, onm onmVar) {
        super(onmVar);
        this.c = kpfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
