package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zm20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm20(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.c = wemVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
