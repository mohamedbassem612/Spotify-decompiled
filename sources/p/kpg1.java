package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kpg1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ npg1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpg1(npg1 npg1Var, onm onmVar) {
        super(onmVar);
        this.b = npg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}
