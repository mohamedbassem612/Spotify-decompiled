package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m2d1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ip61 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2d1(ip61 ip61Var, lnm lnmVar) {
        super(lnmVar);
        this.b = ip61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(false, this);
    }
}
