package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w2m extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ x2m c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2m(x2m x2mVar, onm onmVar) {
        super(onmVar);
        this.c = x2mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
