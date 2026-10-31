package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class alr extends onm {
    public bzc a;
    public /* synthetic */ Object b;
    public final /* synthetic */ skr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alr(skr skrVar, lnm lnmVar) {
        super(lnmVar);
        this.c = skrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
