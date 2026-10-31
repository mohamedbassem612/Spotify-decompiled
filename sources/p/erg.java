package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class erg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lag b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erg(lag lagVar, onm onmVar) {
        super(onmVar);
        this.b = lagVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
