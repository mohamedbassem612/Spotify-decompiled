package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rel extends onm {
    public yel a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sel c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rel(sel selVar, lnm lnmVar) {
        super(lnmVar);
        this.c = selVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
