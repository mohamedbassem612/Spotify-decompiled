package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dvg extends onm {
    public ovg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ovg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvg(ovg ovgVar, onm onmVar) {
        super(onmVar);
        this.c = ovgVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
