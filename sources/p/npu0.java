package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class npu0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r0s0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(r0s0 r0s0Var, onm onmVar) {
        super(onmVar);
        this.c = r0s0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.u(false, this);
    }
}
