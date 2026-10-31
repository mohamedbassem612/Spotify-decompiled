package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lt01 extends onm {
    public vr20 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mt01 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt01(mt01 mt01Var, lnm lnmVar) {
        super(lnmVar);
        this.c = mt01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        this.c.collect(null, this);
        return d9n.a;
    }
}
