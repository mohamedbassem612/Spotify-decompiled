package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ogm extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qgm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogm(qgm qgmVar, onm onmVar) {
        super(onmVar);
        this.b = qgmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(null, this);
    }
}
