package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class da7 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ea7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da7(ea7 ea7Var, onm onmVar) {
        super(onmVar);
        this.c = ea7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
