package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wwq extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xwq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwq(xwq xwqVar, onm onmVar) {
        super(onmVar);
        this.b = xwqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
