package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mib0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nib0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mib0(nib0 nib0Var, onm onmVar) {
        super(onmVar);
        this.b = nib0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.b(null, this);
        return d9n.a;
    }
}
