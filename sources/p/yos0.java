package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yos0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bps0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yos0(bps0 bps0Var, onm onmVar) {
        super(onmVar);
        this.b = bps0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
