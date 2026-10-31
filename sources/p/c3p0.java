package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c3p0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ d3p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3p0(d3p0 d3p0Var, onm onmVar) {
        super(onmVar);
        this.c = d3p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
