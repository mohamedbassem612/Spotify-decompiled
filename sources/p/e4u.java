package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4u extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mxr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4u(mxr mxrVar, onm onmVar) {
        super(onmVar);
        this.b = mxrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.G(false, null, this);
    }
}
