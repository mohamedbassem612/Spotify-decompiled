package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mx5 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ox5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx5(ox5 ox5Var, onm onmVar) {
        super(onmVar);
        this.b = ox5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
