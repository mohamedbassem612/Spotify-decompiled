package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class all1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bll1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public all1(bll1 bll1Var, onm onmVar) {
        super(onmVar);
        this.c = bll1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
