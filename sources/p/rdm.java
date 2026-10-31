package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rdm extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fdd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdm(fdd fddVar, lnm lnmVar) {
        super(lnmVar);
        this.b = fddVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
