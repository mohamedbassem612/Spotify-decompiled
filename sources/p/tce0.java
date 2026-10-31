package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tce0 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uce0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tce0(uce0 uce0Var, onm onmVar) {
        super(onmVar);
        this.c = uce0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
