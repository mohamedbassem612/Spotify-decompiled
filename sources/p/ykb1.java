package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ykb1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mib b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykb1(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.b = mibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
