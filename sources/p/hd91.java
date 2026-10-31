package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hd91 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kd91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd91(kd91 kd91Var, onm onmVar) {
        super(onmVar);
        this.b = kd91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, null, false, null, null, this);
    }
}
