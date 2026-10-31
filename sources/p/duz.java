package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class duz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ euz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duz(euz euzVar, onm onmVar) {
        super(onmVar);
        this.b = euzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
