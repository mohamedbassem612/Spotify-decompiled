package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s0l extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ t0l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0l(t0l t0lVar, lnm lnmVar) {
        super(lnmVar);
        this.c = t0lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
