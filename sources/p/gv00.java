package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gv00 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hv00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv00(hv00 hv00Var, onm onmVar) {
        super(onmVar);
        this.c = hv00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
