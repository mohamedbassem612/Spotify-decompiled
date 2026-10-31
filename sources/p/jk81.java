package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jk81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kk81 b;
    public final /* synthetic */ x2y c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk81(kk81 kk81Var, x2y x2yVar, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = kk81Var;
        this.c = x2yVar;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        x2y x2yVar = this.c;
        kk81 kk81Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cgj1.n(null, xhj.b, null, null, null, 0, 0L, 0L, null, apo.r(-678407734, new nu31(x2yVar, kk81Var, ven0Var, (byte) 13), x340Var2), x340Var2, 805306416, 509);
                    if (((bhm0) ven0Var.getValue()).b) {
                        x340Var2.i0(-820860594);
                        boolean zI = x340Var2.i(kk81Var) | x340Var2.i(x2yVar);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new ik81(kk81Var, x2yVar, (byte) 0);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean zI2 = x340Var2.i(kk81Var) | x340Var2.i(x2yVar);
                        Object objT2 = x340Var2.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new ik81(kk81Var, x2yVar, (byte) 1);
                            x340Var2.s0(objT2);
                        }
                        wgo1.i(function0, (Function0) objT2, cwl1.o0(x340Var2, 2131960817), cwl1.o0(x340Var2, 2131960814), cwl1.o0(x340Var2, 2131960815), cwl1.o0(x340Var2, 2131960816), x340Var2, 0, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-820158103);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = kk81Var.I1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(2022388601, new jk81(kk81Var, x2yVar, ven0Var, b2), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
