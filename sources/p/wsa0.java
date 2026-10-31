package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wsa0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xsa0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsa0(xsa0 xsa0Var, onm onmVar) {
        super(onmVar);
        this.c = xsa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
