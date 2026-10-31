package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xuw0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zuw0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuw0(zuw0 zuw0Var, onm onmVar) {
        super(onmVar);
        this.b = zuw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(false, this);
    }
}
