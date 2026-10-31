package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class niq0 extends onm {
    public vgn0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ piq0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niq0(piq0 piq0Var, onm onmVar) {
        super(onmVar);
        this.d = piq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
