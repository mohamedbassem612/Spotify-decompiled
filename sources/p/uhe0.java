package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uhe0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ whe0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhe0(whe0 whe0Var, onm onmVar) {
        super(onmVar);
        this.b = whe0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
