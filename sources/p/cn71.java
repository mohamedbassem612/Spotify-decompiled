package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cn71 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ in71 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn71(in71 in71Var, onm onmVar) {
        super(onmVar);
        this.c = in71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
