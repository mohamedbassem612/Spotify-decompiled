package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u7t extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v7t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7t(v7t v7tVar, onm onmVar) {
        super(onmVar);
        this.c = v7tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
