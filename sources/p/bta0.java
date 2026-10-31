package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bta0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cta0 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bta0(cta0 cta0Var, onm onmVar) {
        super(onmVar);
        this.c = cta0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
