package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x4x extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b5x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4x(b5x b5xVar, onm onmVar) {
        super(onmVar);
        this.c = b5xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.b(this);
    }
}
