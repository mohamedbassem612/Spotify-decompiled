package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class svy extends onm {
    public uvy a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uvy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svy(uvy uvyVar, onm onmVar) {
        super(onmVar);
        this.c = uvyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((String) null, this, false);
    }
}
