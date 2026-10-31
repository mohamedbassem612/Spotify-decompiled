package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p6z extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ l6z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6z(l6z l6zVar, lnm lnmVar) {
        super(lnmVar);
        this.c = l6zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
