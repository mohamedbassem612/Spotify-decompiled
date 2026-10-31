package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class clf extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y3e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clf(y3e y3eVar, lnm lnmVar) {
        super(lnmVar);
        this.c = y3eVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
