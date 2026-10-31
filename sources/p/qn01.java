package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qn01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tn01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn01(tn01 tn01Var, onm onmVar) {
        super(onmVar);
        this.b = tn01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
