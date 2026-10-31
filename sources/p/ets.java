package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ets extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ x5s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ets(x5s x5sVar, lnm lnmVar) {
        super(lnmVar);
        this.c = x5sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
