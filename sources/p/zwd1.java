package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwd1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ axd1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwd1(axd1 axd1Var, onm onmVar) {
        super(onmVar);
        this.b = axd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
