package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zuh1 extends onm {
    public zp1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ltf1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuh1(ltf1 ltf1Var, onm onmVar) {
        super(onmVar);
        this.c = ltf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
