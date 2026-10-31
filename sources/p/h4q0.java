package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h4q0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ k4q0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4q0(k4q0 k4q0Var, onm onmVar) {
        super(onmVar);
        this.b = k4q0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
