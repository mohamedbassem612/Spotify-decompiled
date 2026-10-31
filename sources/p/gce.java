package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gce extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kba b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gce(kba kbaVar, onm onmVar) {
        super(onmVar);
        this.b = kbaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarE = this.b.e(null, this);
        return d9nVarE == d9n.a ? d9nVarE : new e331(d9nVarE);
    }
}
