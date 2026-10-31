package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdc0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zdc0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdc0(zdc0 zdc0Var, onm onmVar) {
        super(onmVar);
        this.c = zdc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, this);
    }
}
