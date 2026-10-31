package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mr1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nr1 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr1(nr1 nr1Var, onm onmVar) {
        super(onmVar);
        this.c = nr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
