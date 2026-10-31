package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sy71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ d18 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy71(d18 d18Var, onm onmVar) {
        super(onmVar);
        this.b = d18Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.h(this);
    }
}
