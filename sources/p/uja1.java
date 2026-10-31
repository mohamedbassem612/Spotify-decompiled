package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uja1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zja1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uja1(zja1 zja1Var, onm onmVar) {
        super(onmVar);
        this.c = zja1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
