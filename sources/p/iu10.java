package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iu10 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ju10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu10(ju10 ju10Var, onm onmVar) {
        super(onmVar);
        this.c = ju10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
