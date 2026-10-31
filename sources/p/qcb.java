package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qcb extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rcb c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcb(rcb rcbVar, onm onmVar) {
        super(onmVar);
        this.c = rcbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
