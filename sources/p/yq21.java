package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yq21 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ br21 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq21(br21 br21Var, onm onmVar) {
        super(onmVar);
        this.b = br21Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, null, this);
    }
}
