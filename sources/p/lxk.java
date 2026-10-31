package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxk extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mxk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxk(mxk mxkVar, onm onmVar) {
        super(onmVar);
        this.b = mxkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}
