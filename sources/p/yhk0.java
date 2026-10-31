package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yhk0 extends onm {
    public String a;
    public zhk0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zhk0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhk0(zhk0 zhk0Var, onm onmVar) {
        super(onmVar);
        this.e = zhk0Var;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objD = this.e.d(null, null, null, null, null, null, null, this);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
