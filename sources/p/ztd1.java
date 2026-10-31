package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ztd1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bud1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztd1(bud1 bud1Var, onm onmVar) {
        super(onmVar);
        this.c = bud1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
