package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uv5 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yv5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv5(yv5 yv5Var, onm onmVar) {
        super(onmVar);
        this.b = yv5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
