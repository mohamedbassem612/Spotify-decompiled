package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class crh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ frh1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crh1(frh1 frh1Var, onm onmVar) {
        super(onmVar);
        this.b = frh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
