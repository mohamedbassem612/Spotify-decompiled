package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rwj0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ exj0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwj0(exj0 exj0Var, onm onmVar) {
        super(onmVar);
        this.c = exj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(false, this);
    }
}
