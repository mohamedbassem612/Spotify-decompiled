package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c1b0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ d1b0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1b0(d1b0 d1b0Var, onm onmVar) {
        super(onmVar);
        this.b = d1b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
