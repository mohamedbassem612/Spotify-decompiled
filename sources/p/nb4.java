package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nb4 extends onm {
    public uac a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ob4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb4(ob4 ob4Var, onm onmVar) {
        super(onmVar);
        this.c = ob4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
