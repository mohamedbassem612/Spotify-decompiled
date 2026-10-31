package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ntf extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kmf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntf(kmf kmfVar, lnm lnmVar) {
        super(lnmVar);
        this.c = kmfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
