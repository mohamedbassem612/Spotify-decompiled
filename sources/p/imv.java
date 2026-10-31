package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class imv extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jmv c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imv(jmv jmvVar, onm onmVar) {
        super(onmVar);
        this.c = jmvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
