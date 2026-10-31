package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rw5 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vw5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw5(vw5 vw5Var, onm onmVar) {
        super(onmVar);
        this.b = vw5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
