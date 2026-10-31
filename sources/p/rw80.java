package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rw80 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sw80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw80(sw80 sw80Var, onm onmVar) {
        super(onmVar);
        this.c = sw80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
