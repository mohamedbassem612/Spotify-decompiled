package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r7y extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ s7y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7y(s7y s7yVar, onm onmVar) {
        super(onmVar);
        this.b = s7yVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
