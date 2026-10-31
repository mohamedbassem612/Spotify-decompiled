package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v2t extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l6s c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2t(l6s l6sVar, onm onmVar) {
        super(onmVar);
        this.c = l6sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.u(false, this);
    }
}
