package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bv9 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fp8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv9(fp8 fp8Var, onm onmVar) {
        super(onmVar);
        this.b = fp8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, this);
    }
}
