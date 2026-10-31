package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class njk0 extends onm {
    public String a;
    public Object b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qjk0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njk0(qjk0 qjk0Var, onm onmVar) {
        super(onmVar);
        this.e = qjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objD = this.e.d(null, this, false);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
