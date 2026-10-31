package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d4u extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mxr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4u(mxr mxrVar, onm onmVar) {
        super(onmVar);
        this.b = mxrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.F(false, null, this);
    }
}
