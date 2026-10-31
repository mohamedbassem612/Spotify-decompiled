package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a8k extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ b8k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8k(b8k b8kVar, onm onmVar) {
        super(onmVar);
        this.c = b8kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
