package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tt extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xt b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(xt xtVar, onm onmVar) {
        super(onmVar);
        this.b = xtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
