package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kug extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zug b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kug(zug zugVar, onm onmVar) {
        super(onmVar);
        this.b = zugVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(0L, this);
    }
}
