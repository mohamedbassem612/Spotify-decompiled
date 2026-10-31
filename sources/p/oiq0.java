package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oiq0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ piq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiq0(piq0 piq0Var, onm onmVar) {
        super(onmVar);
        this.b = piq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
