package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ftt extends onm {
    public short a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gtt d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftt(gtt gttVar, onm onmVar) {
        super(onmVar);
        this.d = gttVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0L, (String) null, this);
    }
}
