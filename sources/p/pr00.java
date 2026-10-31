package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pr00 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ wem e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr00(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.e = wemVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit((Object) null, this);
    }
}
