package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class scd extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tcd d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scd(tcd tcdVar, onm onmVar) {
        super(onmVar);
        this.d = tcdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
