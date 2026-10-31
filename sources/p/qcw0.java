package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qcw0 extends onm {
    public ayh a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pdw0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcw0(pdw0 pdw0Var, onm onmVar) {
        super(onmVar);
        this.c = pdw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
