package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ixk extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ x1h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixk(x1h x1hVar, lnm lnmVar) {
        super(lnmVar);
        this.c = x1hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
