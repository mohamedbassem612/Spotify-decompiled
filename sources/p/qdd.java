package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qdd extends onm {
    public aod a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bfd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdd(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.c = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
