package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n230 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hl00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n230(hl00 hl00Var, onm onmVar) {
        super(onmVar);
        this.b = hl00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
