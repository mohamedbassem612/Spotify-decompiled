package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cvy extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gvy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvy(gvy gvyVar, onm onmVar) {
        super(onmVar);
        this.c = gvyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
