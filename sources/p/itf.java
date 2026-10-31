package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class itf extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ uq8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itf(uq8 uq8Var, onm onmVar) {
        super(onmVar);
        this.b = uq8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.E(null, this);
    }
}
