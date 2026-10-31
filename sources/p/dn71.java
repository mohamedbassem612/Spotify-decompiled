package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dn71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ in71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn71(in71 in71Var, onm onmVar) {
        super(onmVar);
        this.b = in71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
