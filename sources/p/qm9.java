package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qm9 extends onm {
    public long a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rm9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm9(rm9 rm9Var, onm onmVar) {
        super(onmVar);
        this.d = rm9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(null, null, 0L, false, this);
    }
}
