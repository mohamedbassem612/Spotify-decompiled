package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wng extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aod c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wng(aod aodVar, onm onmVar) {
        super(onmVar);
        this.c = aodVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
