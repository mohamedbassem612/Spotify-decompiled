package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jq80 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ro30 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq80(ro30 ro30Var, onm onmVar) {
        super(onmVar);
        this.b = ro30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.u(null, this);
    }
}
