package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xik1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zik1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xik1(zik1 zik1Var, onm onmVar) {
        super(onmVar);
        this.c = zik1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = this.c.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
