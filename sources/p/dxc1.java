package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dxc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ exc1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxc1(exc1 exc1Var, onm onmVar) {
        super(onmVar);
        this.b = exc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
