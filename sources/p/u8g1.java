package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u8g1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ v8g1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8g1(v8g1 v8g1Var, onm onmVar) {
        super(onmVar);
        this.b = v8g1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
