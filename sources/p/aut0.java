package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aut0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hut0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aut0(hut0 hut0Var, onm onmVar) {
        super(onmVar);
        this.b = hut0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
