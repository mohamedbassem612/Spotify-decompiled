package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bze0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cze0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bze0(cze0 cze0Var, onm onmVar) {
        super(onmVar);
        this.c = cze0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
