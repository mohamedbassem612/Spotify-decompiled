package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jhm1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ohm1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhm1(ohm1 ohm1Var, onm onmVar) {
        super(onmVar);
        this.c = ohm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
