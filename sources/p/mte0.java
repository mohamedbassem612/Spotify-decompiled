package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mte0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tte0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mte0(tte0 tte0Var, byte b) {
        super(3);
        this.a = b;
        switch (b) {
            case 1:
                this.b = tte0Var;
                super(3);
                break;
            default:
                this.b = tte0Var;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tte0 tte0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var.i0(512938704);
                    o4o1.i(tte0Var, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(512995403);
                    x340Var.r(false);
                }
                boolean zG = x340Var.g(tte0Var);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new j2d0(tte0Var, ven0Var, (byte) 9);
                    x340Var.s0(objT2);
                }
                dm5.a((iu30) objT2, u291.d(nim0.a, 1.0f), (iu30) null, x340Var, 0, 4);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                iho1.j(nho1.E(tte0Var.f, b0kVar), apo.r(-473436937, new mte0(tte0Var, (byte) 0), b0kVar), (vu30) null, (vu30) null, (vu30) null, b0kVar, 56, 28);
                break;
        }
        return rih1Var;
    }
}
