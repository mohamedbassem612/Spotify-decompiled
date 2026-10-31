package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dd01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ed01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd01(ed01 ed01Var, onm onmVar) {
        super(onmVar);
        this.b = ed01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
