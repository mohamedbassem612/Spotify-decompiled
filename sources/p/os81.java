package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class os81 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ps81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os81(ps81 ps81Var, onm onmVar) {
        super(onmVar);
        this.c = ps81Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
