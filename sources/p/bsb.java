package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bsb extends onm {
    public ta0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lsb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsb(lsb lsbVar, onm onmVar) {
        super(onmVar);
        this.c = lsbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.z(null, this);
    }
}
