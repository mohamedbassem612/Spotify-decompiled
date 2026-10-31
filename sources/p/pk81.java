package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pk81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qk81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk81(qk81 qk81Var, byte b) {
        super(2);
        this.a = b;
        this.b = qk81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qk81 qk81Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                tv80 tv80Var = (tv80) obj2;
                if (qk81Var.a2 != null) {
                    ulc.r(qk81Var.P0(), str, tv80Var);
                    return rih1Var;
                }
                u890.C("parentalConsentCustomTabLauncher");
                throw null;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                byte b2 = 0;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i(qk81Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new pk81(qk81Var, b2);
                        x340Var2.s0(objT);
                    }
                    ven0 ven0VarS = v8r.s(objT, x340Var2);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        zxo zxoVar = qk81Var.Z1;
                        if (zxoVar == null) {
                            u890.C("elementFactory");
                            throw null;
                        }
                        objT2 = zxoVar.a(new xd2(ven0VarS, (byte) 20));
                        x340Var2.s0(objT2);
                    }
                    zc71 zc71Var = new zc71(vur0.d);
                    WeakHashMap weakHashMap = osl1.x;
                    otw.c((bd71) objT2, zc71Var, td6.o(lhc.g(x340Var2).g, 32, nim0.a), (ipb1) null, x340Var2, 8, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }
}
