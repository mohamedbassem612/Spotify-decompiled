package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hy60 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jy60 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy60(jy60 jy60Var, onm onmVar) {
        super(onmVar);
        this.b = jy60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.I1(this);
    }
}
