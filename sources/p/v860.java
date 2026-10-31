package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v860 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v860(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.c = wemVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
