package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class unk1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vnk1 c;
    public rnk1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unk1(vnk1 vnk1Var, onm onmVar) {
        super(onmVar);
        this.c = vnk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
