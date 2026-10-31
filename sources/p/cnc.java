package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cnc extends onm {
    public enc a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dnc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnc(dnc dncVar, onm onmVar) {
        super(onmVar);
        this.c = dncVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((enc) null, this);
    }
}
