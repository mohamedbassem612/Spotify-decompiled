package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ku0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lu0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(lu0 lu0Var, onm onmVar) {
        super(onmVar);
        this.b = lu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.a(null, this);
    }
}
