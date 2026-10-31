package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fz10 extends onm {
    public taw a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yfu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz10(yfu yfuVar, onm onmVar) {
        super(onmVar);
        this.c = yfuVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
