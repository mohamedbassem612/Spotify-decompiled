package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class urm0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vrm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urm0(vrm0 vrm0Var, onm onmVar) {
        super(onmVar);
        this.c = vrm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
