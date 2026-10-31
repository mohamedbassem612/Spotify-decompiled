package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hce extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kba b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hce(kba kbaVar, onm onmVar) {
        super(onmVar);
        this.b = kbaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(this);
        return objJ == d9n.a ? objJ : new e331(objJ);
    }
}
