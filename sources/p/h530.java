package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h530 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ dzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h530(dzt dztVar, lnm lnmVar) {
        super(lnmVar);
        this.c = dztVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
