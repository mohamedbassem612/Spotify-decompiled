package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tmw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ umw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmw(umw umwVar, onm onmVar) {
        super(onmVar);
        this.c = umwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
