package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c5s extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ wem e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5s(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.e = wemVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
