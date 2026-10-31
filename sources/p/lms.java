package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lms extends onm {
    public ak3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mxr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lms(mxr mxrVar, onm onmVar) {
        super(onmVar);
        this.c = mxrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(null, null, this);
    }
}
