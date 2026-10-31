package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xbg extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g4c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbg(g4c g4cVar, lnm lnmVar) {
        super(lnmVar);
        this.c = g4cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
