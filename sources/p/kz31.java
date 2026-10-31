package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kz31 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lz31 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz31(lz31 lz31Var, onm onmVar) {
        super(onmVar);
        this.b = lz31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
