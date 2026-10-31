package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class unn extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vnn c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unn(vnn vnnVar, onm onmVar) {
        super(onmVar);
        this.c = vnnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k0(0L, this);
    }
}
