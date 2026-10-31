package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j5v extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ m5v b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5v(m5v m5vVar, onm onmVar) {
        super(onmVar);
        this.b = m5vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.S1(this);
    }
}
