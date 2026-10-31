package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hus extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ius b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hus(ius iusVar, lnm lnmVar) {
        super(lnmVar);
        this.b = iusVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((so3) null, this);
    }
}
