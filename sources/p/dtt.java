package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dtt extends onm {
    public short a;
    public long b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gtt e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtt(gtt gttVar, onm onmVar) {
        super(onmVar);
        this.e = gttVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0L, (String) null, this);
    }
}
