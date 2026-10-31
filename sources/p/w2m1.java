package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w2m1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bz11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2m1(bz11 bz11Var, onm onmVar) {
        super(onmVar);
        this.b = bz11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.v(null, null, this);
    }
}
