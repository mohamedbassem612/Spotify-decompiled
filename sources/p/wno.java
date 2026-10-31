package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wno extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wmo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wno(wmo wmoVar, lnm lnmVar) {
        super(lnmVar);
        this.c = wmoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
