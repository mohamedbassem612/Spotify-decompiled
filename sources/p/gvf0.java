package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gvf0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hvf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvf0(hvf0 hvf0Var, onm onmVar) {
        super(onmVar);
        this.c = hvf0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
