package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bj10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gj10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj10(gj10 gj10Var, onm onmVar) {
        super(onmVar);
        this.b = gj10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g((String) null, this);
    }
}
