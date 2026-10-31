package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yu20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mib b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu20(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.b = mibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit((Object) null, this);
    }
}
