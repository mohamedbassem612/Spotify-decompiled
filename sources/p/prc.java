package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class prc extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rrc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prc(rrc rrcVar, onm onmVar) {
        super(onmVar);
        this.c = rrcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
