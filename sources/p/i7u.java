package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7u extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g7u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7u(g7u g7uVar, lnm lnmVar) {
        super(lnmVar);
        this.c = g7uVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
