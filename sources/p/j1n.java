package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1n extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a2n b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1n(a2n a2nVar, onm onmVar) {
        super(onmVar);
        this.b = a2nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D(this);
    }
}
