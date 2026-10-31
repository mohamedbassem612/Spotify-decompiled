package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class abc extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bbc b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abc(bbc bbcVar, onm onmVar) {
        super(onmVar);
        this.b = bbcVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objP = this.b.P(null, 0, 0L, this);
        return objP == d9n.a ? objP : new qge(objP);
    }
}
