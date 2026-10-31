package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a7y extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ f7y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7y(f7y f7yVar, onm onmVar) {
        super(onmVar);
        this.b = f7yVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
