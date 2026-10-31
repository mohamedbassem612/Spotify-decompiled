package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x9d extends onm {
    public nad a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nad c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9d(nad nadVar, onm onmVar) {
        super(onmVar);
        this.c = nadVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m((String) null, this, false);
    }
}
