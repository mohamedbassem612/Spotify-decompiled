package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdg1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ o2b1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg1(o2b1 o2b1Var, onm onmVar) {
        super(onmVar);
        this.b = o2b1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
