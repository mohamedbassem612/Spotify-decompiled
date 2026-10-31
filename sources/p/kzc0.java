package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kzc0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mzc0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzc0(mzc0 mzc0Var, onm onmVar) {
        super(onmVar);
        this.c = mzc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = this.c.a(null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
