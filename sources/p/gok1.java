package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gok1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hok1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gok1(hok1 hok1Var, onm onmVar) {
        super(onmVar);
        this.b = hok1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
