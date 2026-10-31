package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gov0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eov0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gov0(eov0 eov0Var, byte b) {
        super(3);
        this.a = b;
        this.b = eov0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eov0 eov0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                int i = eov0Var.b;
                qim0 qim0VarX = uyn1.x(nim0.a, 12.0f);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                z47.l(i, 0, b0kVar, u291.r(qim0VarX, 16.0f));
                break;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = eov0Var.a;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                if (eov0Var.b == 2) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1835768194);
                    j = cbx.a(x340Var2).b.e;
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1835708519);
                    j = cbx.a(x340Var3).b.c;
                    x340Var3.r(false);
                }
                uwo1.e(str, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1778);
                break;
        }
        return rih1Var;
    }
}
