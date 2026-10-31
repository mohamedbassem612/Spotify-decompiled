package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ge31 implements zqu {
    public final /* synthetic */ byte a;
    public final /* synthetic */ je31 b;

    public /* synthetic */ ge31(je31 je31Var, byte b) {
        this.a = b;
        this.b = je31Var;
    }

    @Override // p.zqu
    public final double c(double d) {
        byte b = this.a;
        je31 je31Var = this.b;
        switch (b) {
            case 0:
                return yoi1.n(je31Var.k.c(d), je31Var.e, je31Var.f);
            default:
                return je31Var.n.c(yoi1.n(d, je31Var.e, je31Var.f));
        }
    }
}
