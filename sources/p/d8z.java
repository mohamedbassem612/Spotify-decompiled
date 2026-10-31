package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8z extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ e8z b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8z(e8z e8zVar, lnm lnmVar) {
        super(lnmVar);
        this.b = e8zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, this);
    }
}
