package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kku0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ swm0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kku0(swm0 swm0Var, onm onmVar) {
        super(onmVar);
        this.b = swm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
