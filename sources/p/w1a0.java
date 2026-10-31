package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w1a0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ x1a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1a0(x1a0 x1a0Var, onm onmVar) {
        super(onmVar);
        this.c = x1a0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
