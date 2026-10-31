package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p8y extends onm {
    public vf01 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q8y c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8y(q8y q8yVar, onm onmVar) {
        super(onmVar);
        this.c = q8yVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
