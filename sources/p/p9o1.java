package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p9o1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ oao1 b;
    public int c;
    public String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9o1(oao1 oao1Var, onm onmVar) {
        super(onmVar);
        this.b = oao1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, this);
    }
}
