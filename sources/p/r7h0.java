package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r7h0 extends onm {
    public String a;
    public String b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y7h0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7h0(y7h0 y7h0Var, onm onmVar) {
        super(onmVar);
        this.e = y7h0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objB = this.e.b(null, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
