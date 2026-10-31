package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nv2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ov2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(ov2 ov2Var, onm onmVar) {
        super(onmVar);
        this.b = ov2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.b(this);
        return rih1.a;
    }
}
