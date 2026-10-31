package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2m1 extends onm {
    public String a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bz11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2m1(bz11 bz11Var, onm onmVar) {
        super(onmVar);
        this.e = bz11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.t(null, this, false);
    }
}
