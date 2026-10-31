package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iwt extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jwt b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwt(jwt jwtVar, onm onmVar) {
        super(onmVar);
        this.b = jwtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
