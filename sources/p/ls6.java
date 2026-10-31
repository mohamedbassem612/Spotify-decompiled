package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls6 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ms6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls6(ms6 ms6Var, onm onmVar) {
        super(onmVar);
        this.b = ms6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
