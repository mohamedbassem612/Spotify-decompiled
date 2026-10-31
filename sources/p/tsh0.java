package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tsh0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ush0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsh0(ush0 ush0Var, onm onmVar) {
        super(onmVar);
        this.c = ush0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
