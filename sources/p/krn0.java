package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class krn0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g7t b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krn0(g7t g7tVar, lnm lnmVar) {
        super(lnmVar);
        this.b = g7tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
