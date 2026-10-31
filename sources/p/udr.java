package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class udr extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ mib e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udr(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.e = mibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
