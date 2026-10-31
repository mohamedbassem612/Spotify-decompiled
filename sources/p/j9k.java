package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j9k extends onm {
    public nak a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k9k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9k(k9k k9kVar, onm onmVar) {
        super(onmVar);
        this.c = k9kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
