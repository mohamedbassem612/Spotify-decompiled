package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jke extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kp5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jke(kp5 kp5Var, onm onmVar) {
        super(onmVar);
        this.b = kp5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(this);
    }
}
