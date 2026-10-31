package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class frt extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ grt c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frt(grt grtVar, onm onmVar) {
        super(onmVar);
        this.c = grtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.setValue((Boolean) null, false, (tv80) null, this);
    }
}
