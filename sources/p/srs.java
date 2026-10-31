package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class srs extends onm {
    public wea1 a;
    public prs b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mxr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srs(mxr mxrVar, onm onmVar) {
        super(onmVar);
        this.d = mxrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x(null, this);
    }
}
