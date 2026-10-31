package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vwo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zwo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwo1(zwo1 zwo1Var, onm onmVar) {
        super(onmVar);
        this.b = zwo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((nwo1) null, this);
    }
}
