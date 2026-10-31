package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cxa extends onm {
    public k261 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dxa d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxa(dxa dxaVar, onm onmVar) {
        super(onmVar);
        this.d = dxaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
