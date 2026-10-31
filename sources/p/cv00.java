package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cv00 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jl00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv00(jl00 jl00Var, onm onmVar) {
        super(onmVar);
        this.c = jl00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
