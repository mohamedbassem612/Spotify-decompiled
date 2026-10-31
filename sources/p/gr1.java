package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gr1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hr1 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr1(hr1 hr1Var, onm onmVar) {
        super(onmVar);
        this.c = hr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
