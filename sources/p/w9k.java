package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w9k extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g4c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9k(g4c g4cVar, lnm lnmVar) {
        super(lnmVar);
        this.c = g4cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.c.emit(null, this);
    }
}
