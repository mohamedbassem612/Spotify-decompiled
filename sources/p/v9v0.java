package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9v0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ewn0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9v0(ewn0 ewn0Var, onm onmVar) {
        super(onmVar);
        this.b = ewn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
