package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odl extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pdl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odl(pdl pdlVar, onm onmVar) {
        super(onmVar);
        this.b = pdlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
