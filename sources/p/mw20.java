package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mw20 implements mr20 {
    public final /* synthetic */ mr20 a;
    public final /* synthetic */ en31 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    public mw20(mr20 mr20Var, en31 en31Var, boolean z, iu30 iu30Var) {
        this.a = mr20Var;
        this.b = en31Var;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objCollect = this.a.collect(new lw20(vr20Var, this.b, this.c, this.d), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
