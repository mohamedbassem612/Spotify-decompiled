package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class shu0 extends onm {
    public thu0 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ thu0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shu0(thu0 thu0Var, onm onmVar) {
        super(onmVar);
        this.d = thu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this, false);
    }
}
