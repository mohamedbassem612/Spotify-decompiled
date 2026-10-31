package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivf0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jvf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivf0(jvf0 jvf0Var, onm onmVar) {
        super(onmVar);
        this.c = jvf0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
