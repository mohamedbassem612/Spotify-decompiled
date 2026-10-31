package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class udd0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vdd0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udd0(vdd0 vdd0Var, onm onmVar) {
        super(onmVar);
        this.b = vdd0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
