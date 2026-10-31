package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zks extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ als b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zks(als alsVar, onm onmVar) {
        super(onmVar);
        this.b = alsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
