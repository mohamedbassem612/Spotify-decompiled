package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yfd1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zfd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfd1(zfd1 zfd1Var, onm onmVar) {
        super(onmVar);
        this.c = zfd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
