package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gt20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ht20 c;
    public vr20 d;
    public l811 e;
    public h441 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt20(ht20 ht20Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ht20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
