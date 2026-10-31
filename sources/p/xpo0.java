package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xpo0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gqo0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpo0(gqo0 gqo0Var, onm onmVar) {
        super(onmVar);
        this.b = gqo0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((String) null, this);
    }
}
