package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xsm1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mib c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsm1(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.c = mibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
