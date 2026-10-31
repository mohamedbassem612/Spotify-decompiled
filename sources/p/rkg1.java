package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rkg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ skg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkg1(skg1 skg1Var, byte b) {
        super(1);
        this.a = b;
        this.b = skg1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        skg1 skg1Var = this.b;
        switch (b) {
            case 0:
                return new x010(d3p1.H(skg1Var.a, skg1Var.e, (nkg1) obj), skg1Var.c.g(), new bu51(3, (lnm) null, (byte) 16), (byte) 1);
            case 1:
                ((qtr) obj).b(new js(skg1Var, (lnm) null, (byte) 21));
                return rih1.a;
            case 2:
                mig1 mig1Var = (mig1) obj;
                kkg1 kkg1Var = skg1Var.b;
                String str = mig1Var.f;
                kkg1Var.getClass();
                return new qkg1(kkg1.a(str), mig1Var.c);
            case 3:
                cbr0 cbr0Var = skg1Var.d;
                hgr0 hgr0VarA = cbr0Var.b0(hgr0.class).a();
                fgr0 fgr0Var = fgr0.a;
                cbr0Var.a(hgr0VarA != null ? new hgr0(fgr0Var, hgr0VarA.b) : new hgr0(fgr0Var, 0, 2));
                return new w9d0(hgr0VarA, skg1Var, (byte) 29);
            default:
                return new kcf1(skg1Var, (byte) 3);
        }
    }
}
