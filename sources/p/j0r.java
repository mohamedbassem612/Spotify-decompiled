package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j0r extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ l0r b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0r(l0r l0rVar, onm onmVar) {
        super(onmVar);
        this.b = l0rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
