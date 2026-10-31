package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w230 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jl00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w230(jl00 jl00Var, onm onmVar) {
        super(onmVar);
        this.b = jl00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
