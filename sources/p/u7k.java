package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7k extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v7k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7k(v7k v7kVar, onm onmVar) {
        super(onmVar);
        this.c = v7kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
