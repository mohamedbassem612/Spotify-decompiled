package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nm11 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zgz0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm11(zgz0 zgz0Var, onm onmVar) {
        super(onmVar);
        this.c = zgz0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
