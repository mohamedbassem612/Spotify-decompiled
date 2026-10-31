package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wid extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xid b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wid(xid xidVar, onm onmVar) {
        super(onmVar);
        this.b = xidVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.p(this);
    }
}
