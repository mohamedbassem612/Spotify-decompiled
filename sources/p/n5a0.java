package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n5a0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p5a0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5a0(p5a0 p5a0Var, onm onmVar) {
        super(onmVar);
        this.b = p5a0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
