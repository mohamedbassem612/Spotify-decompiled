package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pdd0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ur00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdd0(ur00 ur00Var, onm onmVar) {
        super(onmVar);
        this.c = ur00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
