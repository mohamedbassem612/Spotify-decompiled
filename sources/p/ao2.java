package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ao2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ em0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao2(em0 em0Var, onm onmVar) {
        super(onmVar);
        this.b = em0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s0((String) null, this);
    }
}
