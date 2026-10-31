package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aah1 extends onm {
    public String a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bah1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aah1(bah1 bah1Var, onm onmVar) {
        super(onmVar);
        this.e = bah1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(0, null, this);
    }
}
