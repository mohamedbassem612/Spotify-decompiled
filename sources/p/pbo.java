package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pbo extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g1i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbo(g1i g1iVar, onm onmVar) {
        super(onmVar);
        this.c = g1iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n(null, null, this);
    }
}
