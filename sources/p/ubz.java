package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ubz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vbz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubz(vbz vbzVar, onm onmVar) {
        super(onmVar);
        this.b = vbzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
