package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6c1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ezb1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6c1(ezb1 ezb1Var, onm onmVar) {
        super(onmVar);
        this.b = ezb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
