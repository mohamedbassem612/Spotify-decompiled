package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x2b extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y2b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2b(y2b y2bVar, onm onmVar) {
        super(onmVar);
        this.c = y2bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((String) null, this);
    }
}
