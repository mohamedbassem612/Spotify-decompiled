package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d2g extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kmf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2g(kmf kmfVar, lnm lnmVar) {
        super(lnmVar);
        this.c = kmfVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
