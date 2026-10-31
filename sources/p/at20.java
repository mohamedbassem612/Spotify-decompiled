package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class at20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at20(cu cuVar, lnm lnmVar) {
        super(lnmVar);
        this.b = cuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
