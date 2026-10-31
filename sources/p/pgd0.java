package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgd0 extends onm {
    public boolean a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sgd0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgd0(sgd0 sgd0Var, onm onmVar) {
        super(onmVar);
        this.d = sgd0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, false, this);
    }
}
