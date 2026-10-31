package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class njn extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njn(i6b i6bVar, onm onmVar) {
        super(onmVar);
        this.b = i6bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, null, null, null, this);
        return objJ == d9n.a ? objJ : new e331(objJ);
    }
}
