package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tt20 extends onm {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wem c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt20(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.c = wemVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
