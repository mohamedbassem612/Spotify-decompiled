package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ahg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ chg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahg(chg chgVar, onm onmVar) {
        super(onmVar);
        this.b = chgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(null, this);
    }
}
