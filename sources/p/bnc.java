package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bnc extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dnc b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(dnc dncVar, onm onmVar) {
        super(onmVar);
        this.b = dncVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
