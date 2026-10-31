package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dze1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qd51 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dze1(qd51 qd51Var, onm onmVar) {
        super(onmVar);
        this.c = qd51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this, false);
    }
}
