package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kv9 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dv9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv9(dv9 dv9Var, onm onmVar) {
        super(onmVar);
        this.c = dv9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this, false);
    }
}
