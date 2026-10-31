package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uxv0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tzr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxv0(tzr0 tzr0Var, onm onmVar) {
        super(onmVar);
        this.b = tzr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(null, null, null, this);
    }
}
