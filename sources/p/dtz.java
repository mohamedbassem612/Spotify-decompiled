package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dtz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ laz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtz(laz lazVar, onm onmVar) {
        super(onmVar);
        this.b = lazVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(0, this);
    }
}
