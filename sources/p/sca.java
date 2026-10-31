package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sca extends onm {
    public tca a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tca c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sca(tca tcaVar, onm onmVar) {
        super(onmVar);
        this.c = tcaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return tca.C(this.c, null, this);
    }
}
