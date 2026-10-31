package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x2n1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wf2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2n1(wf2 wf2Var, onm onmVar) {
        super(onmVar);
        this.b = wf2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
