package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pg80 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tg80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg80(tg80 tg80Var, onm onmVar) {
        super(onmVar);
        this.b = tg80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
