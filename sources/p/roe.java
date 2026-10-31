package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class roe extends onm {
    public uoe a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uoe c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roe(uoe uoeVar, onm onmVar) {
        super(onmVar);
        this.c = uoeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
