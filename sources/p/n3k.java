package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n3k extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3k(u3k u3kVar, lnm lnmVar) {
        super(lnmVar);
        this.b = u3kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
