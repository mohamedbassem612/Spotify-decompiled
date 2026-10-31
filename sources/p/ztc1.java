package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ztc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ buc1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztc1(buc1 buc1Var, onm onmVar) {
        super(onmVar);
        this.b = buc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
