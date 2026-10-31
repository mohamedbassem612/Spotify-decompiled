package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ej01 extends onm {
    public long a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hj01 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej01(hj01 hj01Var, onm onmVar) {
        super(onmVar);
        this.d = hj01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objD = this.d.d(0L, false, this);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
