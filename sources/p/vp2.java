package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vp2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fq2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(fq2 fq2Var, onm onmVar) {
        super(onmVar);
        this.b = fq2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y(this);
    }
}
