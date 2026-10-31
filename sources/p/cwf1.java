package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cwf1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hke b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwf1(hke hkeVar, onm onmVar) {
        super(onmVar);
        this.b = hkeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
