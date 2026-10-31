package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class my1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ un1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my1(un1 un1Var, onm onmVar) {
        super(onmVar);
        this.b = un1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
