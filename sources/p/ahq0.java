package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ahq0 extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ihq0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq0(ihq0 ihq0Var, onm onmVar) {
        super(onmVar);
        this.c = ihq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
