package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jsb extends onm {
    public drb a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lsb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsb(lsb lsbVar, onm onmVar) {
        super(onmVar);
        this.d = lsbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.E(null, this);
    }
}
